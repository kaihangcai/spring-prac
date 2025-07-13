package com.example.demo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pizza")  // need to declare a prefix to "look out for"
@AllArgsConstructor     // automatically instantiates the constructor with all the variables declared (i.e. for dependency injection)
@NoArgsConstructor  // automatically instantiates the "default" constructor
@Data   // automatically instantiates all the getters and setters implicitly
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;
}
