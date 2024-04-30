package com.hospitalmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagementsystem.entities.Appointments;
import com.hospitalmanagementsystem.services.AppointmentService;

@RestController
@RequestMapping("appointments")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("saveappointment")
	public ResponseEntity<Appointments> saveAppointments(@RequestBody  Appointments appointments) {
		Appointments saveAppointments = appointmentService.saveAppointments(appointments);
		return new ResponseEntity<Appointments>(saveAppointments, HttpStatus.CREATED);
	}
	
	
}
