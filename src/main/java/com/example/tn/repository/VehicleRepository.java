package com.example.tn.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.tn.domain.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

	@Query("SELECT v FROM Vehicle v where v.vin = :vin")
	Vehicle getVehicleByVin(@Param("vin") String vin);

}
