package com.example.tn.dto;

public class VehicleDTO {
	
	private Integer id;
	
	private String model;
	
	private String vin;
	
	private String brand;
	
	public VehicleDTO(Integer id, String model, String vin, String brand) {
		this.id = id;
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
