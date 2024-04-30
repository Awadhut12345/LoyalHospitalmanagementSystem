package com.hospitalmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagementsystem.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
