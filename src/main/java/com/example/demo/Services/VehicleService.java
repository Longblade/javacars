package com.example.demo.Services;

import com.example.demo.Entities.*;
import com.example.demo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    TypeOfEngineRepository typeOfEngineRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    KlasseRepository klasseRepository;

    @Autowired
    CarBodyRepository carBodyRepository;

    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findOne(id);
    }

    public Iterable getVehicles() {
        return vehicleRepository.findAll();
    }


    public Iterable<Vehicle> getVehiclesByType(long id) {
        return typeOfEngineRepository.findOne(id).getVehicles();
    }

    public Iterable<TypeOfEngine> getTypesOfEngine() {
        return typeOfEngineRepository.findAll();
    }

    public TypeOfEngine getTypeOfEngine(long id) {
        return typeOfEngineRepository.findOne(id);
    }


    public Iterable<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(long id) {
        return countryRepository.findOne(id);
    }

    public Iterable<Vehicle> getVehiclesByCountry(long id) {
        return countryRepository.findOne(id).getVehicles();
    }


    public Iterable<Klasse> getKlasses() {
        return klasseRepository.findAll();
    }

    public Klasse getKlasse(long id) {
        return klasseRepository.findOne(id);
    }

    public Iterable<Vehicle> getVehiclesByKlasse(long id) {
        return klasseRepository.findOne(id).getVehicles();
    }

    public Iterable<CarBody> getCarBodies() {
        return carBodyRepository.findAll();
    }

    public CarBody getCarBody(long id) {
        return carBodyRepository.findOne(id);
    }

    public Iterable<Vehicle> getVehiclesByCarBody(long id) {
        return carBodyRepository.findOne(id).getVehicles();
    }
}

