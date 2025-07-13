package com.example.demo.services.impl;

import com.example.demo.services.GreenPrinter;
import org.springframework.stereotype.Component;


public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
