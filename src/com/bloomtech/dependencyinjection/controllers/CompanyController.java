package com.bloomtech.dependencyinjection.controllers;

import com.bloomtech.dependencyinjection.models.Company;
import com.bloomtech.dependencyinjection.models.Contact;
import com.bloomtech.dependencyinjection.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<?> getCompany(@PathVariable String name) {
        Company company = companyService.getCompanyByName(name);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}/contacts")
    public ResponseEntity<?> getContacts(@PathVariable String name) {
        List<Contact> contacts = companyService.getContactsByCompanyName(name);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
