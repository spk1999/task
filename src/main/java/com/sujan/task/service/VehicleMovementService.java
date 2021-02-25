package com.sujan.task.service;

import com.sujan.task.dto.ReportDto;
import com.sujan.task.model.VehicleMovement;

import java.util.List;

public interface VehicleMovementService {

    List<VehicleMovement> getListOfVehicleMovements();
    VehicleMovement addVehicleMovement(VehicleMovement vehicleMovement);
    VehicleMovement updateVehicleMovement(VehicleMovement vehicleMovement);
    List<ReportDto> getReport();

    void getPdfReport();

}
