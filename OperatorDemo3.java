package com.tnsif.lambdaexpressions;
//different implimentations for the same functional interface method at runtime

@FunctionalInterface
 interface Operator3{
	public int operate(int x,int y);
}
public class OperatorDemo3 {
	public static void main (String args[]) {
		
		//addition
	
		Operator3 op=(x,y) ->x+y;
	int sum=op.operate(29,30);
	System.out.println("sum:"+sum);
	
	//difference
	Operator3 op1=(x,y) ->x-y;
	int dif=op1.operate(29,30);
	System.out.println("difference:"+dif);
	}
}
