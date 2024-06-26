package com.hospitalmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagementsystem.entities.Appointments;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments, Long> {

}
