package com.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		testArrayList();

	}
	private static void testArrayList() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		ListIterator<String> itr = arrayList.listIterator(arrayList.size());
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		//for(int i=arrayList.size()-1;i>=0;i--) {
			//System.out.println(arrayList.get(i));
		//}
	}

}
