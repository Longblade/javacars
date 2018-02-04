package com.example.demo.Controllers;

import com.example.demo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    VehicleService service;

    @GetMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("types", service.getTypesOfEngine());
        model.addAttribute("countries", service.getCountries());
        model.addAttribute("klasses", service.getKlasses());
        model.addAttribute("carbodies", service.getCarBodies());
        return "main";
    }
}
