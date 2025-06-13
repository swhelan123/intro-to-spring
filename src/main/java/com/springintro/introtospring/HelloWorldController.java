package com.springintro.introtospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

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

    private final AtomicLong counter = new AtomicLong();

    Random random = new Random();


    @GetMapping("/greeting")
    public Greeting sayGreeting(@RequestParam(defaultValue = "World") String name) {
        //new greeting object, give it incremented id and build content string like before

        long newId = counter.incrementAndGet();
        long randomId = (long) ((long) Math.abs(random.nextLong()) % 1e6);

        return new Greeting(newId, randomId,"Hello " + name + "!");


    }

}
