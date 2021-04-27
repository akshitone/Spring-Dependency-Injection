package com.springTutorial.dependecyInjection;

import com.springTutorial.dependecyInjection.controllers.ConstructorInjectionController;
import com.springTutorial.dependecyInjection.controllers.ControllerDemo;
import com.springTutorial.dependecyInjection.controllers.PropertyInjectionController;
import com.springTutorial.dependecyInjection.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependecyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DependecyInjectionApplication.class, args);
        ControllerDemo controllerDemo = (ControllerDemo) applicationContext.getBean("controllerDemo");
        System.out.println("Return: " + controllerDemo.sayHello());

        System.out.println("-----Property------");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) applicationContext.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("-----Setter------");
        SetterInjectionController setterInjectionController = (SetterInjectionController) applicationContext.getBean("setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("-----Constructor------");
        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) applicationContext.getBean("constructorInjectionController");
        System.out.println(constructorInjectionController.getGreeting());
    }

}
