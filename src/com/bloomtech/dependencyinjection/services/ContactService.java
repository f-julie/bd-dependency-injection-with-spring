package com.bloomtech.dependencyinjection.services;

import com.bloomtech.dependencyinjection.models.Contact;
import com.bloomtech.dependencyinjection.repositories.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContactRepo contactRepo;

    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public List<Contact> getAllContacts() {
        return contactRepo.findAllContacts();
    }

    public Contact getContactByName(String name) {
        return contactRepo.findByName(name);
    }
}
