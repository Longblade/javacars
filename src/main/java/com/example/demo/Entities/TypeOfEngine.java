package com.example.demo.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "TYPE_OF_ENGINE")
public class TypeOfEngine {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "type")
    @JsonBackReference
    private Set<Vehicle> vehicles;

    public TypeOfEngine() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }
}
