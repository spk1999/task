package com.sujan.task.controller;

import com.sujan.task.model.Location;
import com.sujan.task.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/location")
@RestController
public class LocationController {

    public final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService=locationService;
    }

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocation()
    {
        return new ResponseEntity(locationService.getLocation(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Location> saveLocation(@RequestBody Location location)
    {
        return new ResponseEntity(locationService.addLocation(location),HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Location> updateLocation(@RequestBody Location location)
    {
        return new ResponseEntity(locationService.updateLocation(location),HttpStatus.OK);
    }


}
