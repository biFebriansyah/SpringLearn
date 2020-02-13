package com.LearnSpring.springLearn.controller;


import com.LearnSpring.springLearn.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public User sayHello(@RequestParam(value = "name", defaultValue = "Noname")
        String name)
    {
        return new User(name);
    }
}
