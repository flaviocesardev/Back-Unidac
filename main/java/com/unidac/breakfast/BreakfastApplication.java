package com.unidac.breakfast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BreakfastApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreakfastApplication.class, args);
    }

}
