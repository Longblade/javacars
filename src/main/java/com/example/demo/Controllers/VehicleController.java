package com.example.demo.Controllers;

import com.example.demo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    VehicleService service;


    @GetMapping
    public String getVehicles(ModelMap model) {
        model.addAttribute("vehicles", service.getVehicles());
        model.addAttribute("title", "Автомобиль");
        return "vehicles";
    }

    @GetMapping("/{id}")
    public String getVehicle(@PathVariable Long id, ModelMap model) {
        model.addAttribute("vehicle", service.getVehicle(id));
        return "vehicle";
    }

    @GetMapping("/by_type/{id}")
    public String getVehicleByType(@PathVariable long id, ModelMap model) {
        model.addAttribute("vehicles", service.getVehiclesByType(id));
        model.addAttribute("title", service.getTypeOfEngine(id).getName());
        return "vehicles";
    }

    @GetMapping("/by_country/{id}")
    public String getVehicleByCountry(@PathVariable long id, ModelMap model) {
        model.addAttribute("title", service.getCountry(id).getName());
        model.addAttribute("vehicles", service.getVehiclesByCountry(id));
        return "vehicles";
    }


    @GetMapping("/by_klasse/{id}")
    public String getVehicleByKlasse(@PathVariable long id, ModelMap model) {
        model.addAttribute("title", service.getKlasse(id).getName());
        model.addAttribute("vehicles", service.getVehiclesByKlasse(id));
        return "vehicles";
    }


    @GetMapping("/by_carbody/{id}")
    public String getVehicleByCarBody(@PathVariable long id, ModelMap model) {
        model.addAttribute("title", service.getCarBody(id).getName());
        model.addAttribute("vehicles", service.getVehiclesByCarBody(id));

        return "vehicles";
    }
}
