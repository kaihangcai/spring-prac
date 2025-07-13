package com.example.demo;

import com.example.demo.config.PizzaConfig;
import com.example.demo.services.ColorPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// In-line exec with environment var declaration for windows:  $env:SERVER_PORT=8282; ./mvnw.cmd spring-boot:run

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {
    private ColorPrinter colorPrinter;
    private PizzaConfig pizzaConfig;

    public DemoApplication(ColorPrinter colorPrinter, PizzaConfig pizzaConfig) {
        this.colorPrinter = colorPrinter;
        this.pizzaConfig = pizzaConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
    }

    @Override
    public void run(String... args) throws Exception {
        // [Devtiro] 2nd tutorial on Beans
        log.info(colorPrinter.print());

        // [Devtiro] 3rd tutorial on configuration properties
        log.info(String.format("I want a %s crust pizza, with %s and %s sauce", pizzaConfig.getCrust(), pizzaConfig.getTopping(), pizzaConfig.getSauce()));
    }
}
