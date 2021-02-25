package com.sujan.task.controller;

import com.sujan.task.dto.ReportDto;
import com.sujan.task.model.Vehicle;
import com.sujan.task.model.VehicleMovement;
import com.sujan.task.report.GenerateReport;
import com.sujan.task.service.VehicleMovementService;
import com.sujan.task.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vehicle")
@RestController
public class VehicleController {

    private final VehicleService vehicleService;
    private final VehicleMovementService vehicleMovementService;

    public VehicleController(VehicleService vehicleService,VehicleMovementService vehicleMovementService) {
        this.vehicleService=vehicleService;
        this.vehicleMovementService=vehicleMovementService;
    }


    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicle()
    {
        return new ResponseEntity(vehicleService.getVehicles(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle)
    {
        return new ResponseEntity(vehicleService.addVehicle(vehicle),HttpStatus.OK);
    }

    @PostMapping("/movement")
    public ResponseEntity<VehicleMovement> saveVehicleMovement(@RequestBody VehicleMovement vehicleMovement)
    {
        return new ResponseEntity(vehicleMovementService.addVehicleMovement(vehicleMovement),HttpStatus.CREATED);
    }


    @GetMapping("/movement")
    public ResponseEntity<VehicleMovement> getMovement()
    {
        return new ResponseEntity(vehicleMovementService.getListOfVehicleMovements(),HttpStatus.OK);
    }

    @GetMapping("/movement-pdf")
    public ResponseEntity<String> getMovementPdf()
    {
        String response="There was problem creating Report";

     try {
         GenerateReport report = new GenerateReport();

         report.generateReport(vehicleMovementService.getReport());
         response="Report Generated Successfully";
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
        return new ResponseEntity<>(response,HttpStatus.OK);

    }

    @GetMapping("/movement-report")
    public ResponseEntity<List<ReportDto>> getMovementData()
    {
       return new ResponseEntity<>(vehicleMovementService.getReport(),HttpStatus.OK);
    }

}
