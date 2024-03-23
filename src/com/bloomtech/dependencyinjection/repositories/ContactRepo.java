package com.bloomtech.dependencyinjection.repositories;

import com.bloomtech.dependencyinjection.datasource.Datasource;
import com.bloomtech.dependencyinjection.models.Company;
import com.bloomtech.dependencyinjection.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ContactRepo {

    private Datasource datasource;

    public ContactRepo(Datasource datasource) {
        this.datasource = datasource;
    }

    public List<Contact> findAllContacts() {
        return datasource.contactData;
    }

    public Contact findByName(String name) {
        Optional<Contact> contact = datasource.contactData.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst();
        if (contact.isEmpty()) {
            throw new RuntimeException("No contact found with name: " + name);
        }
        return contact.get();
    }

    public List<Contact> findByCompany(Company company) {
        return datasource.contactData.stream()
                .filter(c -> c.getCompany().equals(company))
                .collect(Collectors.toList());
    }
}
