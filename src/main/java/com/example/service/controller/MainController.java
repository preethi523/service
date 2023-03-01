package com.example.service.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.services.CalculateService.CalculateService;

@RestController
public class MainController {

    @Autowired
    private CalculateService calculateValue;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to spring Boot App";
    }

    @GetMapping("/calculate/{n1}/{n2}")
    public Double calculate(@PathVariable Double n1,@PathVariable Double n2){
       return  this.calculateValue.Calculate(n1, n2);
    }
    
}
