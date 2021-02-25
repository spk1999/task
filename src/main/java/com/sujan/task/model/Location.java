package com.sujan.task.model;

import com.sujan.task.constants.Tables;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Tables.LOCATION)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "location_name")
    private String name;

    @OneToMany
    private List<Camera> cameras;


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
