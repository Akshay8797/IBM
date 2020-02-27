package com.collections;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {
		testTreeSet();

	}

	private static void testTreeSet() {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person(50,6,"Ritika"));
		treeSet.add(new Person(80,5,"Mohit"));
		treeSet.add(new Person(30,7,"Nidhi"));
		treeSet.add(new Person(50,6,"Ritika"));
		
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Person a = itr.next();
			System.out.println(a);
		}
	}
		
	}


class Person implements Comparable<Person>
{
int weight,height;
String name;
public Person(int weight,int height,String name)
{
	this.height= height;
	this.weight=weight;
	this.name=name;
}
	@Override
	public int compareTo(Person p) {
		if(this.weight>p.weight)
		{
			return 1;
	}
		else if(this.weight<p.weight)
		{
			return -1;
		}
		else if(this.weight==p.weight)
		{
			if(this.height>p.height)
			{
				return 1;
		}
			else if(this.height<p.height)
			{
				return -1;
			}
			else return 0;
		}
		else
		{
			return 0;
		}
	
			
}
	public String toString() {
		return "Person [height=" + height + "weight=" + weight + "name=" + name + "]";
	}
}
