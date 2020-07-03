package com.bridgelabz.greetingapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class GreetingController {

    @RequestMapping(value = {"", "home"})
    public String sayHello() {
        return "Hello World!...";
    }

    @GetMapping("user")
    public String sayHelloUsingParameters(@RequestParam(value = "firstName") String firstName,
                                          @RequestParam(value = "lastName") String lastName) {
        return "Hello "+firstName+" "+lastName+" ...";
    }

    @GetMapping("user/{firstName}/{lastName}")
    public String sayHelloUsingPath(@PathVariable String firstName, @PathVariable String lastName) {
        return "Hello "+firstName+" "+lastName+" ...";
    }

}
