package com.example.tn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tn.dto.VehicleDTO;
import com.example.tn.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping("/{vin}")
	public VehicleDTO getVehicleByVin(@PathVariable("vin") String vin) {
		VehicleDTO vehicle = vehicleService.getVehicle(vin);
		return  vehicle == null? vehicleService.getVehicleFromThirdParty(vin) : vehicle;
	}

}
