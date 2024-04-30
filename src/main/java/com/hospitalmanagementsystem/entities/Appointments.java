package com.hospitalmanagementsystem.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="appointments")
public class Appointments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;
	
	private LocalDateTime appointmentDateTime;
	
	
	public Long getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient() {
		this.patient=patient;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor() {
		this.doctor=doctor;
	}
	
	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}
	public void setAppointmentDateTime() {
		this.appointmentDateTime=appointmentDateTime;
	}
	
	
	
	
	
}
