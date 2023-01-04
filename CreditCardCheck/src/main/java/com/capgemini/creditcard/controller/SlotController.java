package com.capgemini.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.creditcard.model.slots;
import com.capgemini.creditcard.service.SlotService;

@RestController
@RequestMapping("/slot")
public class SlotController {
	
	@Autowired
	private SlotService slotService;
	 
	@PostMapping("/saveslot")
	public void saveslots(@RequestBody slots slots)
	{
		slotService.saveslots(slots);
	}

}
