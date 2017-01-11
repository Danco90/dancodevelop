package com.daniele.job.interview.logic.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TartagliaTriangle {
	
	private static long[][] calcTraingle(int dim){
		//Defines square matrix of N*N dim
		long x[][] = new long[dim][dim];
		
		//sets first element unitay
		x[0][0] = 1;
		for(int i=1; i<x.length ; i++){
			//sets first column unitary
			x[i][0] = 1;
			//sets first diagonal unitary
			x[i][i] = 1;
			for(int j=1 ; j<x.length-1 ; j++){
				x[i][j] = x[i-1][j-1] + x[i-1][j];
			}
		}
		
		return x;
	}
	
	public static long[] retrieveTartagliaRow(int rowNumber){
		
		long triangle[][] = calcTraingle(rowNumber);
		
		long [] iRow = new long [rowNumber];
		
		
		for (int i=0; i<iRow.length; i++){
              iRow[i] = triangle[rowNumber-1][i];
		}
		
		return iRow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Insert the index of raw to retrieve from tartaglia Triangle :");
		
		
		
		int rowNumber;
		try {
			 rowNumber = Integer.parseInt(br.readLine());
			 long [] row = TartagliaTriangle.retrieveTartagliaRow(rowNumber);
			 System.out.println("Your choise : N="+rowNumber+", n="+(rowNumber-1)+"\n");
			 System.out.print("	row : [");
			 for(int i=0; i<row.length; i++)
			{
			  System.out.print(" "+row[i]+"|");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
