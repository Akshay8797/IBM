package com.Date;

import java.time.*;

public class Date2 {

	public static void main(String[] args) {
		Duration time= Duration.between(LocalTime.now(), LocalTime.NOON);
		if(time.toHours()<24) {
			time=time.plusHours(24);
		}

		System.out.println(time);
	}

}


