package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee
{
	private int id;
	private String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 public void setId(int id)
	    {
	    this.id=id;
	    }
		public void setName(String name)
		{
		this.name=name;
		}
		public int getId()
			     {
		return this.id;
				 }
		public String getName()
			     {
		return this.name;
				 }
				 
				 
public String toString()
{
return this.getId()+ "-" +this.getName();
}
public boolean equals(Object ob)
{
Employee e=(Employee)ob;
if(this.id==e.id&&this.name==e.name)
return true;
else
return false;
}
public int hashCode()
{
return 12;
}
}
public class EmployeeHashTest {

	public static void main(String[] args) {
		testHashMap();
	}


private static void testHashMap() {
	Map<Employee, String> ht = 
			new HashMap<Employee,String>();
	ht.put(new Employee(1,"a"), "Anand");
	ht.put(new Employee(1,"a"), "Anand");
	ht.put(new Employee(2,"c"), "Chandan");
	Iterator<Employee> itr = ht.keySet().iterator();
	while(itr.hasNext()) {
	Employee d = itr.next();
	System.out.println(d);
	System.out.println(d.hashCode());
	System.out.println(d.equals(d));
	}
}
}

