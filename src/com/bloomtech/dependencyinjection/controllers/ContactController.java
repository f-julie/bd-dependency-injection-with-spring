package com.bloomtech.dependencyinjection.controllers;

import com.bloomtech.dependencyinjection.models.Contact;
import com.bloomtech.dependencyinjection.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contacts")
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public ResponseEntity<?> getContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<?> getContactByName(@PathVariable String name) {
        Contact contact = contactService.getContactByName(name);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
}
