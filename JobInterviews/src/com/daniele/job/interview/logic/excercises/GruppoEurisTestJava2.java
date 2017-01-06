package com.daniele.job.interview.logic.excercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 
 * @author daniele
 * @version 0.1
 * @updated 06/01/2017
 *
 */
public class GruppoEurisTestJava2 {
	
	private final String DATA_FATTURA = "DF";
	private final String DATA_FATTURA_FINE_MESE = "DFFM";
	private final String DATA_FATTURA_60 = "DF60";
	
	
	public void parseFile(String fileInPath, String fileOutPath) throws FileNotFoundException{
		
		readInvoices(fileInPath, fileOutPath);
		
	}
	
	private void readInvoices(String fileInPath, String fileOutPath) throws FileNotFoundException{
		
		System.out.println("readInvoices - start");
		
		
		
		try {
			
			File fileIn = new File(fileInPath);
			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOutPath);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
			
			
			//StringBuilder buffer = new StringBuilder();//TODO
			StringBuilder buffer ;
			
			StringBuilder buffer2 = new StringBuilder();
			
			String line;
			int numLine = 0;
			int is = 0;
			
			while ( (line = br.readLine()) != null ) {
				   
				System.out.println("readInvoices - read line "+numLine+" : "+line);
				 
				   if(numLine > 0){
					   
					   buffer = new StringBuilder();
				
					  // buffer.append(line).append("\n");//TODO
					   buffer.append(line);
				   	   String ss = buffer.toString();
				   	   
				   	   System.out.println("readInvoices - buffer.tostring() : '"+ss+"' ");
					 
				       String [] colums = ss.split(";");//TODO
				       
				       
				       //Retrieves the i-value of field 'NrFattura' from file read .
				       //int iA = Integer.parseInt(colums[0 + (3 * is)]);
				       String iA = colums[0 + (3 * is)];
				       System.out.println("readInvoices - iA "+iA);
						 
				       //Retrieves the i-value of field 'DataFattura' from file read .
				       String iB = colums[1 + (3 * is)];
				       System.out.println("readInvoices - iB "+iB);
				       //Retrieves the i-value of field 'ModalitaDiPagamento' from file read .
				       String iC = colums[2 + (3 * is)];
				       System.out.println("readInvoices - iC "+iC);
				       
				       Date todayDate = new Date();
					   DateFormat formatter = new SimpleDateFormat("yyyyMMddHH");
					   String today = formatter.format(todayDate);
				       
				       switch (iC){
				       
				       case DATA_FATTURA:
				    	  // ss.replace(iC, iB); //copy in expiringData the same date of invoice
				    	  // buffer2.append(ss).append("\n");
				    	   buffer2.append( ss.replace(iC, iB)).append("\n");
				    	   
				    	   
				    	   break;
				    
				       case DATA_FATTURA_FINE_MESE:
				    	   //ss.replace(iC, "cambia giorno al 31"); //copy in expiringData the same date of invoice
				    	   buffer2.append(ss.replace(iC, "cambia giorno al 31")).append("\n");
				    	   
				    	   break;
				    	   
                       case DATA_FATTURA_60:
                    	   //ss.replace(iC, "aumenta di due mesi solari"); //copy in expiringData the same date of invoice
				    	   buffer2.append(ss.replace(iC, "aumenta di due mesi solari")).append("\n");
				    	   
				    	   break;
				    	   
				       default :
				       
				           break;
				       
				       }
				       
				       System.out.println("readInvoices - buffer2 = "+buffer2.toString());
				       System.out.println("");
						 
				       
				    }
				   
				   numLine++;
				   
			   }
			
			   System.out.println("readInvoices - buffer2 = "+buffer2.toString());
			 
			
	           bw.write(buffer2.toString());
	           
	           bw.close();
			
			   br.close();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		writeInvoicesOrderedByPayMethod(fileOutPath);
		
		
	}
	
	
	private void writeInvoicesOrderedByPayMethod(String fileOutPath){
		
		System.out.println("writeInvoicesOrderedByPayMethod - start");
		
		
		
		try {
			
			File fileIn = new File(fileOutPath);
			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			
			File fileOut = new File(fileOutPath);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
			
			
			//StringBuilder buffer = new StringBuilder();//TODO
			StringBuilder buffer ;
			
			StringBuilder buffer2 = new StringBuilder();
			
			String line;
			int numLine = 0;
			int is = 0;
			
			while ( (line = br.readLine()) != null ) {
				   
				System.out.println("writeInvoicesOrderedByPayMethod - read line "+numLine+" : "+line);
				 
				   if(numLine > 0){
					   
					   buffer = new StringBuilder();
				
					  // buffer.append(line).append("\n");//TODO
					   buffer.append(line);
				   	   String ss = buffer.toString();
				   	   
				   	   System.out.println("writeInvoicesOrderedByPayMethod - buffer.tostring() : '"+ss+"' ");
					 
				       String [] colums = ss.split(";");//TODO
				       
				       
				       //Retrieves the i-value of field 'NrFattura' from file read .
				       //int iA = Integer.parseInt(colums[0 + (3 * is)]);
				       String iA = colums[0 + (3 * is)];
				       System.out.println("readInvoices - iA "+iA);
						 
				       //Retrieves the i-value of field 'DataFattura' from file read .
				       String iB = colums[1 + (3 * is)];
				       System.out.println("readInvoices - iB "+iB);
				       //Retrieves the i-value of field 'ModalitaDiPagamento' from file read .
				       String iC = colums[2 + (3 * is)];
				       System.out.println("readInvoices - iC "+iC);
				       
				       Date todayDate = new Date();
					   DateFormat formatter = new SimpleDateFormat("yyyyMMddHH");
					   String today = formatter.format(todayDate);
				       
				       switch (iC){
				       
				       case DATA_FATTURA:
				    	  // ss.replace(iC, iB); //copy in expiringData the same date of invoice
				    	  // buffer2.append(ss).append("\n");
				    	   buffer2.append( ss.replace(iC, iB)).append("\n");
				    	   
				    	   
				    	   break;
				    
				       case DATA_FATTURA_FINE_MESE:
				    	   //ss.replace(iC, "cambia giorno al 31"); //copy in expiringData the same date of invoice
				    	   buffer2.append(ss.replace(iC, "cambia giorno al 31")).append("\n");
				    	   
				    	   break;
				    	   
                       case DATA_FATTURA_60:
                    	   //ss.replace(iC, "aumenta di due mesi solari"); //copy in expiringData the same date of invoice
				    	   buffer2.append(ss.replace(iC, "aumenta di due mesi solari")).append("\n");
				    	   
				    	   break;
				    	   
				       default :
				       
				           break;
				       
				       }
				       
				       System.out.println("writeInvoicesOrderedByPayMethod - buffer2 = "+buffer2.toString());
				       System.out.println("");
						 
				       
				    }
				   
				   numLine++;
				   
			   }
			
			   System.out.println("writeInvoicesOrderedByPayMethod - buffer2 = "+buffer2.toString());
			 
			
	           bw.write(buffer2.toString());
	           
	           bw.close();
			
			   br.close();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GruppoEurisTestJava2 test2 = new GruppoEurisTestJava2();
		
		String fileInPath = "C:/MyDevelop/dancodevelop/JobInterviews/input/invoices.txt";
		String fileOutPath = "C:/MyDevelop/dancodevelop/JobInterviews/output/invoicesOrdered.txt";
		
		try {
			test2.parseFile(fileInPath, fileOutPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
