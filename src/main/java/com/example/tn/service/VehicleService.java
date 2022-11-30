package com.example.tn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tn.domain.Vehicle;
import com.example.tn.dto.VehicleDTO;
import com.example.tn.repository.VehicleRepository;
import com.example.tn.util.ThirdPartyAPIHelper;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private ThirdPartyAPIHelper helper;
	
	public VehicleDTO getVehicle(String vin) {
		Vehicle vehicle = vehicleRepository.getVehicleByVin(vin);
		return vehicle == null? null : new VehicleDTO(vehicle.getId(), vehicle.getModel(), vehicle.getVin(), vehicle.getBrand());
	}
	
	public VehicleDTO getVehicleFromThirdParty(String vin) {
		String vehicleToConvert = helper.getVehicleFromThirdPartyAPI(vin);
		//TODO Convert from JSON String in vehicleToConvert to VehicleDTO
		return new VehicleDTO(2, "Palio", "33", "Fiat");
	}

	public void createVehicle(String model, String vin, String brand) {
		vehicleRepository.save(new Vehicle(model, vin, brand));
	}

	public long total() {
		return vehicleRepository.count();
	}

}
