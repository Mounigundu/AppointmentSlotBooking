package com.capgemini.creditcard.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.creditcard.model.appointmentslots;
import com.capgemini.creditcard.service.AppointmentSlotsservice;
import com.capgemini.creditcard.service.CalendarAvailablityRequest;

@RestController
@RequestMapping("/appointment")
public class AppointmentSlotsController {
	
	@Autowired
	private AppointmentSlotsservice appoinmentSlotsservice;
	
	@GetMapping("/slots")
	public CalendarAvailablityRequest finallappointments() throws ParseException
	{
		return appoinmentSlotsservice.findallslots();
		
	}

}
