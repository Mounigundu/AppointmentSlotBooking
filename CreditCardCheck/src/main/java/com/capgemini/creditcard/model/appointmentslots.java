package com.capgemini.creditcard.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class appointmentslots {
	@Id
	private String dateandtime;
	private String duration;
	

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	

	
	@Override
	public String toString() {
		return "appointmentslots [dateandtime=" + dateandtime + ", duration=" + duration + "]";
	}

	public appointmentslots() {
		super();
		// TODO Auto-generated constructor stub
	}

	public appointmentslots(String dateandtime, String duration) {
		super();
		this.dateandtime = dateandtime;
		this.duration = duration;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
