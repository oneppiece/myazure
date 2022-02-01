package com.example.myazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class MyazureApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyazureApplication.class, args);
    }

    @GetMapping
    public String hi() {
        return "hi";
    }

    @GetMapping("/{in}")
    public String hiIn(@PathVariable(name = "in") String in) {
        return in;
    }

}
