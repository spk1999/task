package com.sujan.task.service.serviceImpl;

import com.sujan.task.model.Vehicle;
import com.sujan.task.repo.VehicleRepo;
import com.sujan.task.service.VehicleService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;

    public VehicleServiceImpl(VehicleRepo vehicleRepo) {
        this.vehicleRepo=vehicleRepo;
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicleRepo.findAll();
    }

    @Transactional
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepo.saveAndFlush(vehicle);
    }

    @Transactional
    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicleRepo.saveAndFlush(vehicle);
    }



}
