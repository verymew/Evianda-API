package com.br.evianda.evianda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EviandaApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EviandaApplication.class, args);
    }
}
