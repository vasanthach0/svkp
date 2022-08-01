package com.tnsif.lambdaexpressions;
 interface Operator1{
	public int operate(int x,int y);
}
public class TwoParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operator1 op=(x,y) ->x+y;
int sum=op.operate(10,20);
	System.out.println("sum:"+sum);
}

}
