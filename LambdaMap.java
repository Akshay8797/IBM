package com.Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaMap {
static StringBuilder s3=new StringBuilder();
	public static void main(String[] args) {
	
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "Anand");
		hm.put(1, "Bipin");
		hm.put(4, "Chandan");
		hm.put(3, "Dawood");
		Set<Map.Entry<Integer,String>> s=hm.entrySet();
		Consumer<String> consumer=(String s1)->s3.append(s1+" ");
		Check(s,consumer);
		System.out.println(s3);
	}
	public static void Check(Set<Map.Entry<Integer,String>> s,Consumer<String> c)
	{
	
			  for (Map.Entry<Integer, String> s1: s) 
		        { 
		        System.out.println(s1.getValue());
		       System.out.println(s1.getKey());
		              
		}
	}



}