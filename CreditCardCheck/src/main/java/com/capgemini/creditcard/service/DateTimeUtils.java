package com.capgemini.creditcard.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {
	
	
	
	public static String addMinutes(String time, int duration)
	{   
		/*
		 * int h=Integer.parseInt(slot.substring(0, 2)); int
		 * m=Integer.parseInt(slot.substring(3, 5)); int
		 * s=Integer.parseInt(slot.substring(6, 8)); LocalTime
		 * initialtime=LocalTime.of(h, m, s);
		 * 
		 */
	   // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
	    //LocalDate theDate= LocalDate.parse(date, formatter);

		LocalTime init=LocalTime.parse(time);
		LocalTime finaltime=init.plus(Duration.ofMinutes(duration));
		
		
		String end=finaltime.toString();
		return end;
		
		
	}

}
