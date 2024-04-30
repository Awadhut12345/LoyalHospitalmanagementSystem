package com.hospitalmanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagementsystem.entities.Doctor;
import com.hospitalmanagementsystem.services.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/saveDoctor")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		Doctor saveDoctor1 = doctorService.saveDoctor(doctor);			
		return new ResponseEntity<Doctor>(saveDoctor1, HttpStatus.CREATED);
	}
	
	@GetMapping("/alldoctor")
	public ResponseEntity<List<Doctor>> getAllDoctor() {
		List<Doctor> allDoctors = doctorService.getAllDoctors();
		return ResponseEntity.ok(allDoctors);
	}
	
	@GetMapping("doctor/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable Long id) {
		Optional<Doctor> allDoctors = doctorService.getDoctorById(id);
		return allDoctors.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
				
	}
	
	@DeleteMapping("deleteDoctor/{id}")
	public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctor(id);
		return ResponseEntity.noContent().build();
	}
	
}
