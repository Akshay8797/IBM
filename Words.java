package com.Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Words {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
	
       a.add( "abc"); 
       a.add( "abcd"); 
    for (String  i :a ) { 
    	System.out.println(a.removeIf(n ->(n.length()%2==1)));
       {
    	   
       }
    } 
	}
}


