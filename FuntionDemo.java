package com.tnsif.lambdaexpressions;

import java.time.LocalDate;
import java.util.function.Function;

//funtion interface
interface R<T>{
	 R appply(T t);
}
public class FuntionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<LocalDate,Integer>yearRetriever=date ->date.getYear();
LocalDate today=LocalDate.now();

System.out.println("Year corresponding to "+today + "  id "+yearRetriever.apply(today));
	}

}
