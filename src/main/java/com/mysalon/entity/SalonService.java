package com.mysalon.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalonService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serviceId;
	
	private String serviceName;
	
	private double price;
	
	private int discount;

	private String duration;

	
	
	
}
