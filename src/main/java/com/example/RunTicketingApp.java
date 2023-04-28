package com.example;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RunTicketingApp {

    public static void main(String[] args) {
        SpringApplication.run(RunTicketingApp.class, args);
    }

    @Bean
    public ModelMapper Mapper() {
        return new ModelMapper();
    }

}
