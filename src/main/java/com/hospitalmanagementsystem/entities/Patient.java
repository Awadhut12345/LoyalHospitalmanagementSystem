package com.hospitalmanagementsystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String gender;

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
	
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age=age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender() {
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
