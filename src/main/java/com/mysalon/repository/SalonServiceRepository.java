package com.mysalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysalon.entity.SalonService;

@Repository
public interface SalonServiceRepository extends JpaRepository<SalonService, Long> {

}
