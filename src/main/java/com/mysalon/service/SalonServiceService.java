package com.mysalon.service;

import java.util.List;

import com.mysalon.entity.SalonService;

public interface SalonServiceService {
	
	SalonService addSalonService(SalonService salonService);
	
    SalonService getSalonServiceById(long serviceId);

    List<SalonService> getAllSalonServices();

    void deleteSalonService(long serviceId);

}
