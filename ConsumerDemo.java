package com.tnsif.lambdaexpressions;
//in-built funtional interface
//consumer interface

import java.util.function.Consumer;
interface Tstudent<T>{
  void accept(T t);
}
public class ConsumerDemo {
public static void main(String args[]) {
	Consumer<Integer> multiplier=num -> System.out.println("number is: "+num);
	multiplier.accept(10);
	multiplier.accept(4);
	
}
}
