/*
 * package com.capgemini.creditcard.service;
 * 
 * package com.capgemini.credicard.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.capgemini.credicard.model.AppointmentClass; import
 * com.capgemini.creditcard.repository.AppointmentRepository;
 * 
 * @Service public class AppointmentServiceimpl implements AppointmentService {
 * 
 * 
 * @Autowired private AppointmentRepository appointmentRepository;
 * 
 * @Autowired private AppointmentClass appointmentClass;
 * 
 * private int from; private int to;
 * 
 * @Override public void SaveAppointments(AppointmentClass appointmentClass) {
 * 
 * if(from==12/11/2022) { String temp; String var;
 * temp=appointmentClass.getStart(); var=appointmentClass.getEnd();
 * var=temp.concat("1.00"); appointmentRepository.save(appointmentClass); } else
 * if (appointmentClass.getStart().contains("start")) { throw new
 * Appointmentchangeslot("slot has been booked by someother person please Reschdule the slot"
 * ); }
 * 
 * else { throw new
 * Appointmentchangeslot("Appointments are available for only today"); }
 * 
 * 
 * }
 * 
 * }
 */