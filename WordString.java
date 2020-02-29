package com.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class WordString {
	static StringBuilder s=new StringBuilder("");
	public static void main(String[] args) {
		ArrayList<StringBuilder> ar=new ArrayList<StringBuilder>();	
		ar.add(new StringBuilder("Ritika"));
		ar.add(new StringBuilder("Mandal"));
		Consumer <StringBuilder> consumer=(StringBuilder s1)->s.append(s1.charAt(0));
		Check(ar,consumer);
		System.out.println(s);
	}
	public static void Check(ArrayList <StringBuilder>ar,Consumer c)
	{
		for(StringBuilder a:ar)
		{
			c.accept(a);
		}
	}

}
