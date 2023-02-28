package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/calculate")
    public String welcome(){
        return "welcome to spring Boot App";
    }
    
}
