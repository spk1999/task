package com.sujan.task.repo;

import com.sujan.task.model.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface VehicleMovementRepo extends JpaRepository<VehicleMovement,Integer> {

    @Query(value = "SELECT vehicle.id,location.location_name,camera.camera_details FROM vehicle_movement,vehicle,camera,location WHERE vehicle_movement.camera_id=camera.id AND vehicle_movement.vehicle_id=vehicle.id AND camera.location_id=location.id",nativeQuery = true)
    List<Map<String,Object>> getReport();


}
