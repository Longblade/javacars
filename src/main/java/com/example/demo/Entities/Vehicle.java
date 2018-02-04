package com.example.demo.Entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Float price;
    private String year;
    private Integer str;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID")
    @JsonManagedReference
    private TypeOfEngine type;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    @JsonManagedReference
    private Country country;

    @ManyToOne
    @JoinColumn(name = "CARBODY_ID")
    @JsonManagedReference
    private CarBody carBody;

    @ManyToOne
    @JoinColumn(name = "KLASSE_ID")
    @JsonManagedReference
    private Klasse klasse;

    public Vehicle() {
    }

    public Float getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public Integer getStr() {
        return str;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeOfEngine getType() {
        return type;
    }

    public Country getCountry() {
        return country;
    }

}
