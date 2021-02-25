package com.sujan.task.service;

import com.sujan.task.dto.ReportDto;
import com.sujan.task.model.Vehicle;

import java.util.List;
import java.util.Map;

public interface VehicleService {

    List<Vehicle> getVehicles();
    Vehicle addVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Vehicle vehicle);


}
