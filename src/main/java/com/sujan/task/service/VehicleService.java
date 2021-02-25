package com.sujan.task.service;

import com.sujan.task.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> getVehicles();
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle);


}
