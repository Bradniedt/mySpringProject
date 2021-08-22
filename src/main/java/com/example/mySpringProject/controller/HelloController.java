package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Get endpoint for Hello World
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    // Get endpoint for Hi World
    @GetMapping("/hiworld")
    public String hiWorld() {
        return "Hi World!";
    }
}