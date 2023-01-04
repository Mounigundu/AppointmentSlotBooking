package com.capgemini.creditcard.service;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


public class CalendarAvailableDate {
	
	private String date;
	private List<CalendarAvailabilitySlot> Slots;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<CalendarAvailabilitySlot> getSlots() {
		return Slots;
	}
	public void setSlots(List<CalendarAvailabilitySlot> timeSlotList) {
		this.Slots = timeSlotList;
	}
	@Override
	public String toString() {
		return "CalendarAvailableDate [date=" + date + ", Slots=" + Slots + "]";
	}
	public CalendarAvailableDate(String date, List<CalendarAvailabilitySlot> timeSlotList) {
		super();
		this.date = date;
		this.Slots = timeSlotList;
	}
	public CalendarAvailableDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
