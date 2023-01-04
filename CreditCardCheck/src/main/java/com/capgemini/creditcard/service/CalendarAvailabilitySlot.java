package com.capgemini.creditcard.service;

import javax.persistence.Embeddable;


public class CalendarAvailabilitySlot {
	
	private String start;
	private String end;
	private int maxAppts;
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getMaxAppts() {
		return maxAppts;
	}
	public void setMaxAppts(int maxAppts) {
		this.maxAppts = maxAppts;
	}
	@Override
	public String toString() {
		return "Availability [start=" + start + ", End=" + end + ", maxAppts=" + maxAppts + "]";
	}
	public CalendarAvailabilitySlot(String start, String end, int maxAppts) {
		super();
		this.start = start;
		this.end = end;
		this.maxAppts = maxAppts;
	}
	public CalendarAvailabilitySlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
