package com.mysalon.service;

import java.util.List;


import com.mysalon.entity.Appointment;

public interface AppointmentService {
	
	 Appointment createAppointment(Appointment appointment);

	    Appointment getAppointmentById(long appointmentId);

	    List<Appointment> getAllAppointments();

	    void deleteAppointment(long appointmentId);
	}


