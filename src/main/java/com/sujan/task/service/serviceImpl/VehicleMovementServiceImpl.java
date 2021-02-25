package com.sujan.task.service.serviceImpl;

import com.sujan.task.dto.ReportDto;
import com.sujan.task.model.VehicleMovement;
import com.sujan.task.repo.VehicleMovementRepo;
import com.sujan.task.service.VehicleMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class VehicleMovementServiceImpl implements VehicleMovementService {


    private final VehicleMovementRepo vehicleMovementRepo;

    @Autowired
    public VehicleMovementServiceImpl(VehicleMovementRepo vehicleMovementRepo) {

        this.vehicleMovementRepo=vehicleMovementRepo;

    }

    @Override
    public List<VehicleMovement> getListOfVehicleMovements() {
        return vehicleMovementRepo.findAll();
    }

    @Transactional
    @Override
    public VehicleMovement addVehicleMovement(VehicleMovement vehicleMovement) {
        return vehicleMovementRepo.saveAndFlush(vehicleMovement);
    }

    @Transactional
    @Override
    public VehicleMovement updateVehicleMovement(VehicleMovement vehicleMovement) {
        return vehicleMovementRepo.saveAndFlush(vehicleMovement);
    }

    @Override
    public List<ReportDto> getReport() {
      List<Map<String,Object>> maps=  vehicleMovementRepo.getReport();
      List<ReportDto> reportDtos= new ArrayList<>();
      for(Map<String,Object> x : maps)
      {
          reportDtos.add(new ReportDto(String.valueOf(x.get("location_name")),String.valueOf(x.get("id")),String.valueOf(x.get("camera_details"))));
      }

      return reportDtos;
    }

    @Override
    public void getPdfReport() {

    }
}
