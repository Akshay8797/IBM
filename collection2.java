package com.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
public class collection2 {

	public static void main(String[] args) {
		testLinkedHashSet();

	}
	@SuppressWarnings("unused")
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("Ritika");
		hset.add("Abhi");
		hset.add("Manish");
		hset.add("Zuhaib");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testLinkedHashSet() {
		Set<String> lhset = new LinkedHashSet<String>();
		lhset.add("Ritika");
		lhset.add("Abhi");
		lhset.add("Manish");
		lhset.add("Zuhaib");
		
		Iterator<String> itr = lhset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
}
