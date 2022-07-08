package com.tnsif.variables;

import java.io.*;

public class Daysofmonth {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the month ");
		String str=b.readLine();
		 
		switch(str) {
		
		case "January":
			System.out.println("the number of days in January is 31");
			break;
		case "February":
			System.out.println("the number of days in February is 28");
			break;
		case "March":
			System.out.println("the number of days in March is 31");
			break;
		case "April":
			System.out.println("the number of days in April is 30");
			break;
		case "May":
			System.out.println("the number of days in May is 31");
			break;
		case "June":
			System.out.println("the number of days in Juneis 30");
			break;
		case "July":
			System.out.println("the number of days in July is 31");
			break;
		case "August":
			System.out.println("the number of days in August is 31");
			break;
		case "September":
			System.out.println("the number of days in September is 30");
			break;
		case "October":
			System.out.println("the number of days in Octoberis 31");
			break;
		case "November":
			System.out.println("the number of days in November is 30");
			break;
		case "December":
			System.out.println("the number of days in December is 31");
			break;
		default:
			System.out.println("This is not the correct name of the month");
			break;
			
			
		}
	}

}
