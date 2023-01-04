package com.capgemini.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.creditcard.model.slots;
import com.capgemini.creditcard.repository.SlotRepository;

@Service
public class SlotService {
	
	@Autowired
	private SlotRepository slotRepository;
	
	public void saveslots(slots slots)
	{
		slotRepository.save(slots);
	}

	
}
