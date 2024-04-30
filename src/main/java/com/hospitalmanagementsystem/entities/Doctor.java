package com.hospitalmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Doctors")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String specialization;
	private String hospital;
	
	public Long getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization() {
		this.specialization=specialization;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital() {
		this.hospital=hospital;
	}
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", hospital=\" + hospital + \"]";
	}	
	
	
}
