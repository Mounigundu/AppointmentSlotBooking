package com.capgemini.creditcard.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class availability {
	
	@Id
	private String date;
	@OneToOne
	private slots slots;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public slots getSlots() {
		return slots;
	}
	public void setSlots(slots slots) {
		this.slots = slots;
	}
	@Override
	public String toString() {
		return "availability [date=" + date + ", slots=" + slots + "]";
	}
	public availability(String date, com.capgemini.creditcard.model.slots slots) {
		super();
		this.date = date;
		this.slots = slots;
	}
	public availability() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
