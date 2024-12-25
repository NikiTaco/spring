
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.controller.MainController;
import com.example.demo.event.EventPublisher;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private MainController mainController;

    @Autowired
    private EventPublisher eventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        mainController.run();
        eventPublisher.publishEvent("Hello from Observer Pattern!");
    }
}
