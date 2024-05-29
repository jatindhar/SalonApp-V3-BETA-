package com.mysalon.entity;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appointmentId;
	
	private String location;
	
	private String visitType;
	
	private String preferredService;
	
	private LocalDate preferredDate;
	
	private LocalTime preferredTime;
	
	//INSERT INTO appointment (location, visit_type, preferred_service, preferred_date, preferred_time)
	//VALUES ('kolkata', 'Special', 'haircut', '2024-06-01', '14:30:00');
}
