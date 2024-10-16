package com.lyceum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/status")
public class StatusController {


    @GetMapping
    public String status(){
        return "OK";
    }
}
