package com.hospitalmanagementsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagementsystem.entities.Appointments;
import com.hospitalmanagementsystem.repositories.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public Appointments saveAppointments(Appointments appointments) {
		return appointmentRepository.save(appointments);
	}
	
	
	
	
	
}
