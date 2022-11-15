package com.spring.springbootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello Spring Boot";
    }
}
