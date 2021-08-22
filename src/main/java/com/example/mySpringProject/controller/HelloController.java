package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping("/hiworld")
    public String hiWorld() {
        return "Hi World!";
    }
}