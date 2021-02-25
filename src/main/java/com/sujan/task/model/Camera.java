package com.sujan.task.model;

import com.sujan.task.constants.Tables;

import javax.persistence.*;

@Entity
@Table(name = Tables.CAMERA)
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "camera_details")
    private String details;

    @ManyToOne
    @JoinColumn(name = "location_id",referencedColumnName = "id")
    private Location location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
