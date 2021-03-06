package com.example.demo.Controllers;

import com.example.demo.Services.UserDetailsServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserDetailsServiceUtil userDetailsServiceUtil;

    @GetMapping("/reg")
    public String get() {
        return "reg";
    }

    @PostMapping("/reg")
    public String post(@RequestParam Map<String, String> params, ModelMap model) {
        System.out.println(params.get("username"));
        System.out.println(params.get("password"));
        model.addAttribute("msg", userDetailsServiceUtil.registerAccount(params.get("username"), params.get("password")));
        return "reg_report";
    }


}
