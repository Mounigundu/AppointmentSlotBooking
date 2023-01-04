
package com.capgemini.creditcard.service;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


public class CalendarAvailablityRequest {

	
	private String from;
	private String to;
	private List<CalendarAvailableDate> availability;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public List<CalendarAvailableDate> getAvailability() {
		return availability;
	}
	public void setAvailability(List<CalendarAvailableDate> availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "CalendarAvailablityRequest [from=" + from + ", to=" + to + ", availability=" + availability + "]";
	}
	public CalendarAvailablityRequest(String from, String to, List<CalendarAvailableDate> availability) {
		super();
		this.from = from;
		this.to = to;
		this.availability = availability;
	}
	public CalendarAvailablityRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
