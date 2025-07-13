package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    // references a key-value field in application.properties
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println("appName: " + appName);
        return "index.html";
    }

    @GetMapping(path = "/hello")
    @ResponseBody
    public String helloWorld() {
        return "hello world!";
    }
}
