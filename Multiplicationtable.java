package com.tnsif.variables;
import java.io.*;
import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args)throws IOException  {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int Mul,j,i;
		i=s.nextInt();
		System.out.println("the multiplication table of the given number is :");
		for(j=1;j<=20;j++)
		{
			Mul =(j*i);
			System.out.println(Mul);
			
			s.close();
		}
	}

}
