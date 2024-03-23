package com.bloomtech.dependencyinjection;

import com.bloomtech.dependencyinjection.controllers.CompanyController;
import com.bloomtech.dependencyinjection.datasource.Datasource;
import com.bloomtech.dependencyinjection.repositories.CompanyRepo;
import com.bloomtech.dependencyinjection.repositories.ContactRepo;
import com.bloomtech.dependencyinjection.services.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
