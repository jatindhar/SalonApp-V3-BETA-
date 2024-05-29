package com.mysalon.controller;

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

import com.mysalon.entity.SalonService;
import com.mysalon.service.SalonServiceService;

@RestController
@RequestMapping("/salon-services")
public class SalonServiceController {

	
	 @Autowired
	    private SalonServiceService salonServiceService;
	 
	 @PostMapping
	    public ResponseEntity<SalonService> addSalonService(@RequestBody SalonService salonService) {
	        SalonService createdSalonService = salonServiceService.addSalonService(salonService);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdSalonService);
	    }

	    @GetMapping("/{serviceId}")
	    public ResponseEntity<SalonService> getSalonServiceById(@PathVariable long serviceId) {
	        SalonService salonService = salonServiceService.getSalonServiceById(serviceId);
	        if (salonService != null) {
	            return ResponseEntity.ok(salonService);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping
	    public ResponseEntity<java.util.List<SalonService>> getAllSalonServices() {
	        java.util.List<SalonService> salonServices = salonServiceService.getAllSalonServices();
	        return ResponseEntity.ok(salonServices);
	    }

	    @DeleteMapping("/{serviceId}")
	    public ResponseEntity<Void> deleteSalonService(@PathVariable long serviceId) {
	        salonServiceService.deleteSalonService(serviceId);
	        return ResponseEntity.noContent().build();
	    }
}
