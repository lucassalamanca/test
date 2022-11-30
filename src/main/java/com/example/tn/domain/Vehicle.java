package com.example.tn.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length = 50)
	private String model;
	
	@Column(length = 20)
	private String vin;
	
	@Column(length = 50)
	private String brand;
	
	public Vehicle() {};
	
	public Vehicle(String model, String vin, String brand) {
		this.model = model;
		this.vin = vin;
		this.brand = brand;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
