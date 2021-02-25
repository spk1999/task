package com.sujan.task.model;

import com.sujan.task.constants.Tables;

import javax.persistence.*;

@Entity
@Table(name = Tables.VEHICLE)
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "vehicle_name")
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
