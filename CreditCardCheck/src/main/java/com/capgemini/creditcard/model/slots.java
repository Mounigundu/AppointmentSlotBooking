package com.capgemini.creditcard.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class slots {

	@Id
	private String starttime;
	private String endtime;
	private int maxAppts;
	private String unitIds;
	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getMaxAppts() {
		return maxAppts;
	}
	public void setMaxAppts(int maxAppts) {
		this.maxAppts = maxAppts;
	}
	public String getUnitIds() {
		return unitIds;
	}
	public void setUnitIds(String unitIds) {
		this.unitIds = unitIds;
	}
	@Override
	public String toString() {
		return "slots [starttime=" + starttime + ", endtime=" + endtime + ", maxAppts=" + maxAppts + ", unitIds="
				+ unitIds + "]";
	}
	public slots(String starttime, String endtime, int maxAppts, String unitIds) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.maxAppts = maxAppts;
		this.unitIds = unitIds;
	}
	public slots() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
