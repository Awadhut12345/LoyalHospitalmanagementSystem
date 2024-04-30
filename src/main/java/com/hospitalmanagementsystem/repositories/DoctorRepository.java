package com.hospitalmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagementsystem.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
