package com.sujan.task.model;

import com.sujan.task.constants.Tables;

import javax.persistence.*;

@Entity
@Table(name=Tables.VEHICLEMOVEMENT)
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "vehicle_id",referencedColumnName = "id")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "camera_id",referencedColumnName = "id")
    private Camera camera;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
