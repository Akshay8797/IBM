package com.Lambda;

public class ArithmeticTest {

	public static void main(String[] args) {
		int a = 5,b=4; 
       Calculations s = (int x,int y)->{
    	  // return Math.addExact(a,b);
    	  // return Math.subtractExact(a,b);
    	   return Math.multiplyExact(a,b);
    	   //return Math.floorDiv(a,b);
       }; 
        int ans = s.calculate(a, b); 
        System.out.println(ans);
	}

}
@FunctionalInterface
interface Calculations
{
	int calculate(int a,int b);
}
