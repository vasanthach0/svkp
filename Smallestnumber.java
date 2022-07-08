package com.tnsif.variables;
import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
	
		System.out.println("Enter the three numbers :");
		Scanner s=new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a<b)
		{
		  if(a<c)
		    {
			System.out.println("the smallest number of the given three numbers is :"+a);
		    }
		  else if(b<c)
		  	{
			System.out.println("the smallest number of the given three numbers is :"+b);
		  	}
		  	else {
		
		  		System.out.println("the smallest number of the given three numbers is :"+c);
		  		}
	     
			}
		s.close();
		
     }
	
}