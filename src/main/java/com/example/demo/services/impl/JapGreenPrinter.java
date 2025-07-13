package com.example.demo.services.impl;

import com.example.demo.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class JapGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "midori";
    }
}
