package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "KLASSE")
public class Klasse {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "klasse")
    @JsonBackReference
    private Set<Vehicle> vehicles;

    public Klasse() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }


}
