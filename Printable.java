package com.tnsif.lambdaexpressions;
@FunctionalInterface
public  interface Printable {
public void print(String str);
default void format(String str){

	System.out.println("formating string str....");
}
}
