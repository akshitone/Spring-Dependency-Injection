package com.springTutorial.dependecyInjection.controllers;

import com.springTutorial.dependecyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerDemo {
    private final GreetingService greetingService;

    public ControllerDemo(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
