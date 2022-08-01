package com.tnsif.lambdaexpressions;

import java.util.function.Predicate;

//predicate interface

interface predicate<T>{
	boolean test(T t);
}
public class PredicateDemo {
public static void main (String args[]){
	Predicate<String> stringchecker=str ->str.isEmpty();
	String s="	Hello ";
	boolean result=stringchecker.test(s);
	System.out.println(s+"  is empty: "+result);
}
}
