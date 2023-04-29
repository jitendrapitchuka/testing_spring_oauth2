package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testingController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/secure")
    public String secure(){
        return "this is secured";
    }
}
