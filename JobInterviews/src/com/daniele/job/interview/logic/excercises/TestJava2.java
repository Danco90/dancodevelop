package com.daniele.job.interview.logic.excercises;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * 
 * @author danielematteo
 * @version 1.0
 * @updated 07/01/2017
 * 
 * 
 *
 */
public class TestJava2 {
	
	
	private String fileInputPath;
	private String fileOutPath;
	
	public TestJava2(String fileInputPath, String fileOutPath) {
		this.fileInputPath = fileInputPath;
		this.fileOutPath = fileOutPath;
	}


	public static class Constants {
		
		private static final String PAYMENT_METHOD_INVOICE_DATE_VALUE = "DF";
		private static final String PAYMENT_METHOD_INVOICE_DATE_END_MONTH_VALUE = "DFFM";
		private static final String PAYMENT_METHOD_INVOICE_DATE_60_VALUE = "DF60";
		private static final String INVOICES_SOURCE_FILE_HEAD_PAYMENT_METHOD_FIELD_NAME = "ModalitaDiPagamento";
		private static final String INVOICES_DEST_FILE_HEAD_EXPIRING_DATE_FIELD_NAME = "DataScadenza";
		
		
	}
	
	
	public void parseFile(String fileInPath, String fileOutPath,String fileOut2Path) throws FileNotFoundException{
		
		System.out.println("parseFile - start");
		//POINT a) and b)
		readInvoices(fileInPath, fileOutPath);
		
		 //POINT c) and d)
		writeInvoicesOrderedByPayMethod(fileOutPath,fileOut2Path);
		
	}
	
	
	private void readInvoices(String fileInPath, String fileOutPath) throws FileNotFoundException{
		
		System.out.println("readInvoices - start");
		try 
		{
			File fileIn = new File(fileInPath);
			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOutPath);
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
					       Date theLastDayOfMonth = calcTheLastDateOfCurrentMonth(myDate);
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
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	private void writeInvoicesOrderedByPayMethod(String fileOutPath, String fileOut2Path){
		
		System.out.println("writeInvoicesOrderedByPayMethod - start");
		
		try 
		{
			File fileIn = new File(fileOutPath);
			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOut2Path);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
			
			StringBuilder buffer ;
			StringBuilder buffer2 = new StringBuilder();
			
			Map<Integer,String> unorderedLinesListMap = new HashMap<Integer,String>();
			Map<Integer,Long> unorderedDatesListMap = new HashMap<Integer,Long>();
			
			String line;
			int numLine = 0;
			int is = 0;
			
			  
			
			//First loop for filling map
			while ( (line = br.readLine()) != null ) 
			{
				System.out.println("writeInvoicesOrderedByPayMethod - read line "+numLine+" : "+line);
				 
				   if(numLine < 1){ //copy the header in the new file, changing the 3rd column's name 
				    
					   buffer2.append( line).append("\n");
					   
				   }else
				   {
					   buffer = new StringBuilder();
					   buffer.append(line);
				   	   String ss = buffer.toString();
				   	   System.out.println("writeInvoicesOrderedByPayMethod - buffer.tostring() : '"+ss+"' ");
				       String [] colums = ss.split(";");//TODO
				       
				       //Retrieves the i-value of field 'NrFattura' from file read .
				       int iA = Integer.parseInt(colums[0 + (3 * is)]);
				       //String iA = colums[0 + (3 * is)];
				       System.out.println("readInvoices - iA "+iA);
				       //Retrieves the i-value of field 'DataFattura' from file read .
				       String iB = colums[1 + (3 * is)];
				       System.out.println("readInvoices - iB "+iB);
				       //Retrieves the i-value of field 'DataScadenza' from file read .
				       String iC = colums[2 + (3 * is)];
				       System.out.println("readInvoices - iC "+iC);
				       
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
			   br.close();
			   
			   
			  //create array for date ordering asc
			  long [] unorderedExpDates = new long [unorderedDatesListMap.size()];
             
			  //Filling date ordering array
			  int i = 0;
			  
              for(long millidate : unorderedDatesListMap.values()){
            	  unorderedExpDates[i]=millidate;
            	  i++;
              }
              
              //Order By Expiring Date
              bubbleSort(unorderedExpDates);
              
              
              for(int y =0; y<unorderedExpDates.length;y++){
            	
            	  //Get the Id given the expiring date in millis, following a sorted sequence
            	 
            	  //GET KEY FROM VALUEEE
            	  int id = (Integer) getKeyFromValue(unorderedDatesListMap, unorderedExpDates[y]);
            	  System.out.println("after getKeyFromValue of unorderedexprdates[] array - id="+id);
            	  
            	  String theWholeline = unorderedLinesListMap.get(id);
            	  System.out.println("The line selected in sorted sequence ="+theWholeline);
            	  
            	  buffer2.append(theWholeline).append("\n");
            	  
              }
				 
			 
			   
			br.close();//TODO
			   
			System.out.println("writeInvoicesOrderedByPayMethod - buffer2 #323= "+buffer2.toString());
			 
			bw.write(buffer2.toString());
	        
			bw.close();
			
			  
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	private Date calcTheLastDateOfCurrentMonth(Date myDate){
		
		System.out.println("calcTheLastDateOfCurrentMonth - start for date : '"+myDate+"'");
		
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.setTime(myDate);
		myCalendar.add(Calendar.MONTH, 1);
		myCalendar.set(Calendar.DAY_OF_MONTH, 1);
		myCalendar.add(Calendar.DAY_OF_MONTH, -1);
		
		return myCalendar.getTime();
		
	}
	
	
	public static void bubbleSort( long [ ] dateInmillis )
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
	
	
	public static Object getKeyFromValue(Map hm, Object value) {
		
        for (Object o : hm.keySet()) {
          if (hm.get(o).equals(value)) {
            return o;
          }
        }
        return null;
      }
	

	public static void main(String[] args) {
		
		String fileInPath   = "C:/MyDevelop/dancodevelop/JobInterviews/input/invoices.txt";
		String fileOutPath1 = "C:/MyDevelop/dancodevelop/JobInterviews/output/paymentExpiringInvoices.txt";
		String fileOutPath2 = "C:/MyDevelop/dancodevelop/JobInterviews/output/invoicesOrdered.txt";
		
		TestJava2 test2 = new TestJava2(fileInPath,fileOutPath1);
		
		try 
		{
			test2.parseFile(fileInPath, fileOutPath1,fileOutPath2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	


	public String getFileInputPath() {
		return fileInputPath;
	}


	public void setFileInputPath(String fileInputPath) {
		this.fileInputPath = fileInputPath;
	}


	public String getFileOutPath() {
		return fileOutPath;
	}


	public void setFileOutPath(String fileOutPath) {
		this.fileOutPath = fileOutPath;
	}


}
