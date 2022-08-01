package com.tnsif.lambdaexpressions;

import java.util.Random;
import java.util.function.Supplier;

//supplier interface

interface svkp{
	svkp get();
}
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supplier<Double>randomNumberSupplier=()->new Random(20).nextDouble();
System.out.println(randomNumberSupplier.get());
//System.out.println(randomNumberSupplier.get());
}

}
