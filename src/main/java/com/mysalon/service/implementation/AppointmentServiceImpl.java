package com.mysalon.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysalon.entity.Appointment;
import com.mysalon.repository.AppointmentRepository;
import com.mysalon.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	 private AppointmentRepository appointmentRepository;
	
    @Override
    public Appointment createAppointment(Appointment appointment) {
    	
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(long appointmentId) {
        java.util.Optional<Appointment> appointmentOptional = appointmentRepository.findById(appointmentId);
        return appointmentOptional.orElse(null);
    }
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public void deleteAppointment(long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }
	
}
