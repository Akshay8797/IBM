package com.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;

public class Date3 {

	public static void main(String[] args) {

	LocalDate localdate=LocalDate.now();
	long year=localdate.getLong(ChronoField.YEAR);
	LocalDate temp=null,temp1=null;
	long checkYear=year;
	if(Year.isLeap(year))
	{	temp=LocalDate.parse(year+"-02-29");
		if(localdate.isAfter(temp))
		{	checkYear=checkYear+1;
		
			while(!(Year.isLeap(checkYear)))
			{
				checkYear=checkYear+1;
			}
			temp1=LocalDate.parse(checkYear+"-02-29");
			Period period=Period.between(localdate, temp1);
			System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
		}
		else
		{
			Period period=Period.between(localdate, temp);
			System.out.println(period.getDays()+" "+period.getMonths()+" "+period.getYears());
		}
	}
	
}
}
