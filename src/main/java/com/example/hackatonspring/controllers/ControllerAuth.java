package com.example.hackatonspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAuth {

    @GetMapping("/")
    public String test(){
        return "Test Auth";
    }

    @GetMapping("/salut")
    public String test1() {
        return "Test Access auth";
    }
}
