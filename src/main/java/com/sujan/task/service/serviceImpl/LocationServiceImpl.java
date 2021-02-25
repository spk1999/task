package com.sujan.task.service.serviceImpl;

import com.sujan.task.model.Location;
import com.sujan.task.repo.LocationRepo;
import com.sujan.task.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {


    private final LocationRepo locationRepo;

    @Autowired
    public LocationServiceImpl (LocationRepo locationRepo)
    {
        this.locationRepo=locationRepo;
    }


    @Override
    public List<Location> getLocation() {
        return locationRepo.findAll();
    }

    @Transactional
    @Override
    public Location addLocation(Location location) {
        return locationRepo.saveAndFlush(location);
    }

    @Transactional
    @Override
    public Location updateLocation(Location location) {
        return locationRepo.saveAndFlush(location);
    }
}
