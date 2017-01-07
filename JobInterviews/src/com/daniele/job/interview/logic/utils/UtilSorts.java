package com.daniele.job.interview.logic.utils;

public class UtilSorts {
	
	public static void bubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   //if ( num[ j ] < num[j+1] )   // change to > for ascending sort
	                   if ( num[ j ] > num[j+1] )   // change to < for ascending sort 
	                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                           flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	} 
	
	public static void main(String [] args){
		
		int [] num = {5,4,2,3,1};
		System.out.println("unordered array = 5 4 2 3 1");
		bubbleSort(num);
		
		System.out.print("  ordered array = ");
		for (int i=0; i<num.length; i++){
		   System.out.print(num[i]+" ");
		}
		System.out.println(";");
		
	}

}
