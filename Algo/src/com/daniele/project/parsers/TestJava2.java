package com.daniele.project.parsers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



/**
 * 
 * @author danielematteo
 * @version 1.0b
 * @updated 07/01/2017
 * 
 * 
 *
 */
public class TestJava2 {
	
	
	private String fileInputPath;
	private String directoryOutPath;
	
	public TestJava2(String fileInPath, String dirOutPath) {
		this.fileInputPath = fileInPath;
		this.directoryOutPath = dirOutPath;
	}


	public static class Constants {
		
		private static final String PAYMENT_EXPIRING_INVOICES_FIRST_OUT_FILE_NAME = "paymentExpiringInvoices.txt";
		private static final String INVOICES_ORDERED_SECOND_OUT_FILE_NAME = "invoicesOrdered.txt";
		private static final String PAYMENT_METHOD_INVOICE_DATE_VALUE = "DF";
		private static final String PAYMENT_METHOD_INVOICE_DATE_END_MONTH_VALUE = "DFFM";
		private static final String PAYMENT_METHOD_INVOICE_DATE_60_VALUE = "DF60";
		private static final String INVOICES_SOURCE_FILE_HEAD_PAYMENT_METHOD_FIELD_NAME = "ModalitaDiPagamento";
		private static final String INVOICES_DEST_FILE_HEAD_EXPIRING_DATE_FIELD_NAME = "DataScadenza";
		
		
	}
	
	
	public void parseFile() throws FileNotFoundException{
		
		System.out.println("parseFile - start");
		//POINT a) and b)
		readInvoices();
		
		 //POINT c) and d)
		writeInvoicesOrderedByPayMethod();
		
	}
	
	
	private void readInvoices() throws FileNotFoundException{
		
		System.out.println("readInvoices - start");
		String fileOutPat = getDirectoryOutPath()+"/"+Constants.PAYMENT_EXPIRING_INVOICES_FIRST_OUT_FILE_NAME;
		try 
		{
			File fileIn = new File(getFileInputPath());
			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOutPat);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
			
			StringBuilder buffer ;
			StringBuilder buffer2 = new StringBuilder();
			
			String line;
			int numLine = 0;
			int is = 0;
			
			/*
			 * POINT a) 
			 */
			while ( (line = br.readLine()) != null ) 
			{ 
				   if(numLine < 1){ //copy the header in the new file, changing the 3rd column's name 
					    
					   buffer2.append( line.replace(Constants.INVOICES_SOURCE_FILE_HEAD_PAYMENT_METHOD_FIELD_NAME, Constants.INVOICES_DEST_FILE_HEAD_EXPIRING_DATE_FIELD_NAME)).append("\n");
					   
				   }else
				   {	 
					   buffer = new StringBuilder();
					   buffer.append(line);
				   	   String ss = buffer.toString();
				   	   
				       String [] colums = ss.split(";");//TODO
				       
				       //Retrieves the i-value of field 'NrFattura' from file read .
				       String iA = colums[0 + (3 * is)];
				       //Retrieves the i-value of field 'DataFattura' from file read .
				       String iB = colums[1 + (3 * is)];
				       //Retrieves the i-value of field 'ModalitaDiPagamento' from file read .
				       String iC = colums[2 + (3 * is)];
				       
				       Date myDate = new SimpleDateFormat("dd/MM/yyyy").parse(iB);
				       
				       /*
						* POINT b) : Calculate the Payment-Expiring-date for each invoices . 
						* 
						*/
				       switch (iC){
				       
				       case Constants.PAYMENT_METHOD_INVOICE_DATE_VALUE :
				    	  buffer2.append( ss.replace(iC, iB)).append("\n");
				    	  break;
				    
				       case Constants.PAYMENT_METHOD_INVOICE_DATE_END_MONTH_VALUE :
				    	   
				    	   Calendar cal = Calendar.getInstance();
					       cal.setTime(myDate); // Now use a given date.
					       Date theLastDayOfMonth = Utils.calcTheLastDateOfCurrentMonth(myDate);
					       String theLastOfMonth = new SimpleDateFormat("dd/MM/yyyy").format(theLastDayOfMonth);
					       
					       System.out.println("readInvoices - theLastOfMonth : '"+theLastOfMonth+"'");
					       buffer2.append(ss.replace(iC, theLastOfMonth)).append("\n");
				    	   break;
				    	   
                       case Constants.PAYMENT_METHOD_INVOICE_DATE_60_VALUE:
                    	   
                    	   Calendar c3 = Calendar.getInstance();
    				       c3.setTime(myDate); // Now use a given date.
    				       c3.add(Calendar.MONTH, 2); // Adding 5 days
    				       
    				       //Date --> String CONVERSION
    				       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    				       String twoMonthsLonger = sdf.format(c3.getTime());
    				       System.out.println("readInvoices - 2 months Have just been added to the date = "+twoMonthsLonger);
    				      
    				       buffer2.append(ss.replace(iC, twoMonthsLonger)).append("\n");
				    	   break;
				    	   
				       default :
				       
				           break;
				       
				       }
				       
				       
				    }
				   
				   numLine++;
				   
			   }
			
			  
	           bw.write(buffer2.toString());
	           
	           bw.close();
			
			   br.close();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("readInvoices - ERROR IOException :"+e);
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("readInvoices - ERROR ParseException"+e);
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	private void writeInvoicesOrderedByPayMethod(){
		
		System.out.println("writeInvoicesOrderedByPayMethod - start");
		String fileToReadPath = getDirectoryOutPath()+"/"+Constants.PAYMENT_EXPIRING_INVOICES_FIRST_OUT_FILE_NAME;
		
		String fileOutPath = getDirectoryOutPath()+"/"+Constants.INVOICES_ORDERED_SECOND_OUT_FILE_NAME;
		
		try 
		{
			File fileIn = new File(fileToReadPath);
			BufferedReader buffReader = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOutPath);
			BufferedWriter buffWriter = new BufferedWriter(new FileWriter(fileOut));
			
			StringBuilder buffer ;
			StringBuilder buffer2 = new StringBuilder();
			
			Map<Integer,String> unorderedLinesListMap = new HashMap<Integer,String>();
			Map<Integer,Long>   unorderedDatesListMap = new HashMap<Integer,Long>();
			
			String line;
			int numLine = 0;
			int is = 0;
			
			  
			//First loop for filling map
			while ( (line = buffReader.readLine()) != null ) 
			{
				
				   if(numLine < 1){ //copy the header in the new file, changing the 3rd column's name 
				    
					   buffer2.append( line).append("\n");
					   
				   }else
				   {
					   buffer = new StringBuilder();
					   buffer.append(line);
					   
				   	   String ss = buffer.toString();
				   	   
				   	   String [] colums = ss.split(";");//TODO
				       
				       //Retrieves the i-value of field 'NrFattura' from file read .
				       int iA = Integer.parseInt(colums[0 + (3 * is)]);
				       //Retrieves the i-value of field 'DataFattura' from file read .
				       String iB = colums[1 + (3 * is)];
				       //Retrieves the i-value of field 'DataScadenza' from file read .
				       String iC = colums[2 + (3 * is)];
				       
				       Date paymentExpiringDate = new SimpleDateFormat("dd/MM/yyyy").parse(iC);
				       System.out.println("readInvoices - paymentExpiringDate = "+paymentExpiringDate);
				       
				       long paymentExpiringDateInMillis = paymentExpiringDate.getTime();
				       
				       //**fill the map with each lines read
				       unorderedLinesListMap.put(iA, line);
				       
				       //**fill the map with each expiring date of each line (ID-> NrFattura)
				       unorderedDatesListMap.put(iA, paymentExpiringDateInMillis);
				     
				    }
				   
				   numLine++;
				   
			   }
			   buffReader.close();
			   
			   
			  //create array for date ordering asc
			  long [] unorderedExpDates = new long [unorderedDatesListMap.size()];
			  //Filling date ordering array
			  int i = 0;
			  
              for(long millidate : unorderedDatesListMap.values()){
            	  unorderedExpDates[i]=millidate;
            	  i++;
              }
              
              //Order By Expiring Date
              Utils.bubbleSort(unorderedExpDates);
              
              
              for(int y =0; y<unorderedExpDates.length;y++){
            	  //Get the Id given the expiring date in millis, following a sorted sequence
            	 
            	  //GET KEY FROM VALUEEE
            	  int id = (Integer) Utils.getKeyFromValue(unorderedDatesListMap, unorderedExpDates[y]);
            	 
            	  String theWholeline = unorderedLinesListMap.get(id);
            	  
            	  buffer2.append(theWholeline).append("\n");
            	  
              }
				 
			 
			   
			buffReader.close();
			 
			buffWriter.write(buffer2.toString());
	        
			buffWriter.close();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("writeInvoicesOrderedByPayMethod - ERROR IOException :"+e);
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.err.println("writeInvoicesOrderedByPayMethod - ERROR IOException :"+e);
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	

	
	public static void main(String[] args) {
		
		String inputFilePath   = "C:/MyDevelop/dancodevelop/JobInterviews/input/invoices.txt";
		String outputDirPath  = "C:/MyDevelop/dancodevelop/JobInterviews/output";
		
		
		TestJava2 test2 = new TestJava2(inputFilePath,outputDirPath);
		
		try 
		{
			test2.parseFile();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("writeInvoicesOrderedByPayMethod - ERROR FIleNotFoundException :"+e);
			e.printStackTrace();
		}
		

	}
	


	public String getFileInputPath() {
		return fileInputPath;
	}


	public void setFileInputPath(String fileInputPath) {
		this.fileInputPath = fileInputPath;
	}


	public String getDirectoryOutPath() {
		return directoryOutPath;
	}


	public void setDirectoryOutPath(String directoryOutPath) {
		this.directoryOutPath = directoryOutPath;
	}

	

	
   public static class Utils {
	   
	   
	   public static Date calcTheLastDateOfCurrentMonth(Date myDate){
			
			System.out.println("calcTheLastDateOfCurrentMonth - start for date : '"+myDate+"'");
			
			Calendar myCalendar = Calendar.getInstance();
			myCalendar.setTime(myDate);
			myCalendar.add(Calendar.MONTH, 1);
			myCalendar.set(Calendar.DAY_OF_MONTH, 1);
			myCalendar.add(Calendar.DAY_OF_MONTH, -1);
			
			return myCalendar.getTime();
			
		}
	   
	   /**
		 * 
		 * @param hm
		 * @param value
		 * @return
		 * @description retry the key given a map's value
		 */
		public static Object getKeyFromValue(Map hm, Object value) {
			
	        for (Object o : hm.keySet()) {
	          if (hm.get(o).equals(value)) {
	            return o;
	          }
	        }
	        return null;
	      }
		
		
		private static void bubbleSort( long [ ] dateInmillis )
		{
		     int j;
		     boolean flag = true;   // set flag to true to begin first pass
		     long temp;   //holding variable

		     while ( flag )
		     {
		            flag= false;    //set flag to false awaiting a possible swap
		            for( j=0;  j < dateInmillis.length -1;  j++ )
		            {
		                   //if ( num[ j ] < num[j+1] )   // change to > for ascending sort
		                   if ( dateInmillis[ j ] > dateInmillis[j+1] )   // change to < for ascending sort 
		                   {
	                           temp = dateInmillis[ j ]; //swap elements
	                           dateInmillis[ j ] = dateInmillis[ j+1 ];
	                           dateInmillis[ j+1 ] = temp;
	                           flag = true;              //shows a swap occurred  
		                  } 
		            } 
		      } 
		} 
		
   }
	


}
