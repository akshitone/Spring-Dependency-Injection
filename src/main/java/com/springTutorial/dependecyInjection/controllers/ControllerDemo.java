package com.springTutorial.dependecyInjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerDemo {
    public String sayHello(){
        System.out.println("Hello world.");
        return "Hello Amigos.";
    }
}
