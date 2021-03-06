package com.bridgelabz.greetingapi.controller;

import com.bridgelabz.greetingapi.model.Greeting;
import com.bridgelabz.greetingapi.service.GreetingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("GreetingAPI")
public class GreetingController {

    @Autowired
    GreetingApiService greetingApiService;

    @GetMapping("Get/{userId}")
    public Greeting getGreeting(@PathVariable("userId") int userId) {
        return greetingApiService.getGreeting(userId);
    }

    @PostMapping("Add")
    public Greeting addGreeting(@RequestBody Greeting greeting) {
        return greetingApiService.addGreeting(greeting);
    }

    @PutMapping("update/{userId}")
    public Greeting updateGreeting(@RequestBody Greeting greeting, @PathVariable("userId") int userId) {
        return greetingApiService.updateGreeting(greeting, userId);
    }

    @DeleteMapping("delete/{userId}")
    public Greeting deleteGreeting(@PathVariable("userId") int userId) {
        return greetingApiService.deleteGreeting(userId);
    }

}
