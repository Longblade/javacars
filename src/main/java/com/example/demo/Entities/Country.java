package com.example.demo.Entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COUNTRY")
public class Country {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "country")
    @JsonBackReference
    private Set<Vehicle> vehicles;

    public Country() {
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
