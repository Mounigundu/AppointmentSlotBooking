package com.capgemini.creditcard.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	
	public static String addDays(String str, int numberofdays) throws ParseException
	{
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date t=sdf.parse(str);
		cal.setTime(t);
		cal.add(Calendar.DAY_OF_MONTH, numberofdays);
		System.out.println(sdf.format(cal.getTime()));
		return sdf.format(cal.getTime());
		 
		
		
	}

}
