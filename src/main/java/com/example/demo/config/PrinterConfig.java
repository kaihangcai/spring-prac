package com.example.demo.config;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.ColorPrinter;
import com.example.demo.services.GreenPrinter;
import com.example.demo.services.RedPrinter;
import com.example.demo.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Note: This is one such possible implementation of declaring beans (i.e. objects in global context) for the rest of the application to reference and use
//@Configuration
public class PrinterConfig {

    // Beans are somewhat like "global" objects / objects stored in a global context that are then automatically "fed" into arguments by the spring framework
    @Bean
    public BluePrinter bluePrinter() {
//        return new EnglishBluePrinter();
        return new JapBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
