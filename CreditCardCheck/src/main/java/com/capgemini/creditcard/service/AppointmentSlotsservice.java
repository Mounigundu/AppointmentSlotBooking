package com.capgemini.creditcard.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.creditcard.model.appointmentslots;
import com.capgemini.creditcard.repository.Appointmentslotsrepository;

@Service
public class AppointmentSlotsservice {

	@Autowired
	private Appointmentslotsrepository appointmentslotsrepository;

	static final Integer DEFAULT_TIMESLOT_DURATION = 30;
	static final Integer DEFAULT_VISITS_PER_TIMESLOT = 1;

	CalendarAvailablityRequest req;
	int TotalDays = 28;
	int remainingdays = 0;
	String lcldate;

	public CalendarAvailablityRequest findallslots() throws ParseException {

		List<appointmentslots> findAll = appointmentslotsrepository.findAll();
		TreeMap<String, List<CalendarAvailabilitySlot>> timeMap = new TreeMap<String, List<CalendarAvailabilitySlot>>();
		for (appointmentslots appointmentslots : findAll) {
			// TreeMap<String, List<CalendarAvailabilitySlot>> timeMap = new TreeMap<String,
			// List<CalendarAvailabilitySlot>>();
			String date;
			String time;
			String slot = appointmentslots.getDateandtime();
			int duration = DEFAULT_TIMESLOT_DURATION;
			date = slot.substring(0, 10);
			time = slot.substring(11, 19);

			if (!timeMap.containsKey(date)) {
				timeMap.put(date, new ArrayList<CalendarAvailabilitySlot>());
			}
			timeMap.get(date).add(new CalendarAvailabilitySlot(time, DateTimeUtils.addMinutes(time, duration),
					DEFAULT_VISITS_PER_TIMESLOT));

		}
		// System.out.println(timeMap.entrySet());

		while (TotalDays > 0) {

			for (appointmentslots appointmentslots : findAll) {
				String datetime = appointmentslots.getDateandtime();
				lcldate = datetime.substring(0, 10);
				break;
			}

			req = new CalendarAvailablityRequest();

			req.setFrom(lcldate);
			if (TotalDays < 7) {
				req.setTo(DateUtils.addDays(lcldate, TotalDays));
			} else {
				req.setTo(DateUtils.addDays(lcldate, 6));
			}
			req.setAvailability(new ArrayList<CalendarAvailableDate>());

			System.out.println(req.getFrom());
			System.out.println(req.getTo());

			TotalDays = TotalDays - 7;
			remainingdays = remainingdays + 7;
		}
		CalendarAvailableDate cad;
		String date = null;
		
		for (Iterator<String> it = timeMap.keySet().iterator(); it.hasNext();)
		{
			date = it.next();

			cad = new CalendarAvailableDate();
			cad.setDate(date);
			cad.setSlots(timeMap.get(date));
           req.getAvailability().add(cad);
		}
		
		
	//	List result = new ArrayList<>();
		//result.add(0, new CalendarAvailablityRequest(req.getFrom(), req.getTo(),
				//new CalendarAvailableDate(date, timeMap.get(date))));
		// List result = new ArrayList<>(timeMap.entrySet());

		// result.add(0, new CalendarAvailablityRequest(req.getFrom(), req.getTo(), new
		// CalendarAvailableDate(date,timeMap.get(date)) ));
		// result.add(1,new CalendarAvailableDate(date,timeMap.get(date)));

		return req;
	}

}
