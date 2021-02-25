package com.sujan.task.service;

import com.sujan.task.model.Location;

import java.util.List;

public interface LocationService {

    List<Location> getLocation();
    Location addLocation(Location location);
    Location updateLocation(Location location);

}
