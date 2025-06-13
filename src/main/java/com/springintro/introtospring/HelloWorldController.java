package com.springintro.introtospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye World from Spring Boot";
    }

//    @GetMapping("/greeting")
//    public String sayGreeting(@RequestParam String name) {
//        return "Hello " + name + "!";
//    }

    @GetMapping("/greeting")
    public Greeting sayGreeting(@RequestParam(defaultValue = "World") String name) {
        //new greeting object, give it id of 1 and build content string like before
        return new Greeting(1L, "Hello " + name + "!");


    }

}
