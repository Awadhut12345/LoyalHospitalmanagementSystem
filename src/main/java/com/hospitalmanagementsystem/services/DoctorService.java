package com.hospitalmanagementsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagementsystem.entities.Doctor;
import com.hospitalmanagementsystem.repositories.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}
	
	public Optional<Doctor> getDoctorById(Long id) {
		return doctorRepository.findById(id);
	}
 	
	public void deleteDoctor(Long id) {
		doctorRepository.deleteById(id);
	}
}
