package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class Date
{
   private int day,month,year;
		  public Date(int day,int month,int year)
         {
         this.day=day;
         this.month=month;
         this.year=year;
         }			
			    public void setDay(int day)
			    {
			    this.day=day;
			    }
				public void setMonth(int month)
				{
				this.month=month;
				}
				public void setYear(int year)
				{
				this.year=year;
				}
				
				public int getDay()
					     {
				return this.day;
						 }
				public int getMonth()
						 {
			    return this.month;
						  }
				public int getYear()
					     {
				return this.year;
						 }
						 
						 
	public String toString()
		{
    return this.getDay()+ "-" +this.getMonth()+ "-"+this.getYear();
		}

      
public boolean equals(Object ob)
{
Date d2=(Date)ob;
if(this.day==d2.day&&this.month==d2.month)
return true;
else
return false;
}

@Override
public int hashCode()
{
return 12;
}
}
public class EmployeeHash {

	public static void main(String[] args) {
		testHashMap();

	}
	private static void testHashMap() {
	
		HashMap<Date, String> ht = new HashMap<>();
		ht.put(new Date(12,3,2019), "Anand");
		ht.put(new Date(23,6,2018), "Bipin");
		ht.put(new Date(5,11,2010), "Chandan");
		ht.put(new Date(5,11,2011), "Dawood");

		Iterator<Date> itr = ht.keySet().iterator();
		while(itr.hasNext()) {
		Date d = itr.next();
		System.out.println(d);
		}
		String s=ht.get(new Date(5,11,2010));
		System.out.println("Call ="+s);
       
	}
	}


