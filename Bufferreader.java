package com.tnsif.variables;
import java.io.BufferedReader;

import java.io.*;

public class Bufferreader {

	public static void main(String[] args)throws IOException {
		
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	double i;
	System.out.println("enter the number");
	 
	i=Double.parseDouble(b.readLine());
		if(i>0)	       
		    System.out.println("the given number is positive");	
	    else 
		    System.out.println("the given number is negative");
	     
	  	}

}
