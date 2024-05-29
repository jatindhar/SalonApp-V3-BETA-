package com.mysalon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysalon.entity.Appointment;
import com.mysalon.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	  @Autowired
	    private AppointmentService appointmentService;
	  
	  @PostMapping
	    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
	        Appointment createdAppointment = appointmentService.createAppointment(appointment);
	        return new ResponseEntity<>(createdAppointment, HttpStatus.CREATED);
	    }
	  
	  @GetMapping("/{appointmentId}")
	    public ResponseEntity<Appointment> getAppointmentById(@PathVariable long appointmentId) {
	        Appointment appointment = appointmentService.getAppointmentById(appointmentId);
	        if (appointment != null) {
	            return new ResponseEntity<>(appointment, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping
	    public ResponseEntity<List<Appointment>> getAllAppointments() {
	        List<Appointment> appointments = appointmentService.getAllAppointments();
	        return new ResponseEntity<>(appointments, HttpStatus.OK);
	    }
	    
	    @DeleteMapping("/{appointmentId}")
	    public ResponseEntity<Void> deleteAppointment(@PathVariable long appointmentId) {
	        appointmentService.deleteAppointment(appointmentId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
