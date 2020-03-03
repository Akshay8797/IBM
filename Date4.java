package com.Date;

import java.time.LocalTime;
import java.time.ZoneId;

public class Date4 {

	public static void main(String[] args) {
		
		ZoneId europezone=ZoneId.of("Europe/Rome");
		LocalTime localtime=LocalTime.now(europezone);
		System.out.println("Rome: "+localtime);
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println("Kolkata: "+id1);  
	    System.out.println("Tokyo: "+id2);  
	}

}

