package com.example.aservice.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        try {
            myMethod();
        }catch (Exception e) {

        }

        return "hello world";
    }

    private void myMethod() throws IllegalAccessException{


    }
}
