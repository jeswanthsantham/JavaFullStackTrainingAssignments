package com.training.basics;

public class DownPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=5;
     for (int i=1; i<=num; i++) {
    	 for(int j=num; j>=i; j--) {
    		 System.out.print("*");
    	 }
    	 System.out.println( );
     }
	}

}
