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

import com.hospitalmanagementsystem.entities.Patient;
import com.hospitalmanagementsystem.services.PatientService;

@RestController
@RequestMapping("patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/savePatient")
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		Patient savePatient1 = patientService.savePatient(patient);
		return new ResponseEntity<Patient>(savePatient1, HttpStatus.CREATED);
	}
	
	@GetMapping("/allpatients")
	public ResponseEntity<List<Patient>> getAllPatient() {
		List<Patient> allPatient = patientService.getAllPatient();
		return ResponseEntity.ok(allPatient);
	}
	
	@GetMapping("patient/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
		Optional<Patient> patientById = patientService.getPatientById(id);
		return patientById.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());		
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
}
