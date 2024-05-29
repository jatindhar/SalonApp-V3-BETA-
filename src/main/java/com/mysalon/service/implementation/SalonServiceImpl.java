package com.mysalon.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysalon.entity.SalonService;
import com.mysalon.repository.SalonServiceRepository;
import com.mysalon.service.SalonServiceService;

import java.util.List;
import java.util.Optional;

@Service
public class SalonServiceImpl implements SalonServiceService {

    @Autowired
    private SalonServiceRepository salonServiceRepository;

    @Override
    public SalonService addSalonService(SalonService salonService) {
        return salonServiceRepository.save(salonService);
    }

    @Override
    public SalonService getSalonServiceById(long serviceId) {
        Optional<SalonService> optionalSalonService = salonServiceRepository.findById(serviceId);
        return optionalSalonService.orElse(null);
    }

    @Override
    public List<SalonService> getAllSalonServices() {
        return salonServiceRepository.findAll();
    }

    @Override
    public void deleteSalonService(long serviceId) {
        salonServiceRepository.deleteById(serviceId);
    }
}

