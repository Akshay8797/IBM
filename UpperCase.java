package com.Lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UpperCase {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();	
		ar.add("Ritika");
		ar.add("Mandal");
		ar.add("abc");
		UnaryOperator<String> uo=(String s)->(s.replaceAll(s,s.toUpperCase()));
		Check(ar,uo);
		
	}
	public static void Check(ArrayList<String> ar,UnaryOperator<String>uo)
	{
		for(String a:ar)
		{
			System.out.println(uo.apply(a));
		}
	}

}
