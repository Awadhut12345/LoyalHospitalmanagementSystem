package com.hospitalmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagementsystem.entities.Patient;
import com.hospitalmanagementsystem.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}
	
	public Optional<Patient> getPatientById(Long id) {
		return patientRepository.findById(id);
	}
	
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
	}
	
}
