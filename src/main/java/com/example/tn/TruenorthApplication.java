package com.example.tn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tn.service.VehicleService;

@SpringBootApplication
public class TruenorthApplication implements CommandLineRunner{
	
	@Autowired
	private VehicleService vehicleService;

	public static void main(String[] args) {
		SpringApplication.run(TruenorthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createVehicles();
		System.out.println("Loaded " + vehicleService.total() + " vehicles");
	}

	private void createVehicles() {
		vehicleService.createVehicle("Sonic","12","Chevrolet");
		vehicleService.createVehicle("Falcon","15","Ford");
		vehicleService.createVehicle("Civic","18","Honda");
		vehicleService.createVehicle("Corolla","22","Toyota");
		vehicleService.createVehicle("Golf","25","Volkswagen");
	}

}
