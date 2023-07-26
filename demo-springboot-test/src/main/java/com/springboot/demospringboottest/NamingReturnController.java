package com.springboot.demospringboottest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamingReturnController {

    @GetMapping("/hello/{name}")
    public String helloWithPath(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello " + name;
    }
}
