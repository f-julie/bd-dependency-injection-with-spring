package com.bloomtech.dependencyinjection.repositories;

import com.bloomtech.dependencyinjection.datasource.Datasource;
import com.bloomtech.dependencyinjection.models.Company;
import com.bloomtech.dependencyinjection.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompanyRepo {

    private Datasource datasource;
    private ContactRepo contactRepo;

    public CompanyRepo(Datasource datasource, ContactRepo contactRepo) {
        this.datasource = datasource;
        this.contactRepo = contactRepo;
    }

    public Company findByName(String name) {
        Optional<Company> company = datasource.companyData.stream().filter(c -> c.getName().equals(name)).findFirst();
        if (company.isEmpty()) {
            throw new RuntimeException("No company found with name: " + name);
        }
        return company.get();
    }

    public List<Contact> findContacts(String name) {
        Company company = findByName(name);
        List<Contact> contacts = contactRepo.findByCompany(company);
        return contacts;
    }
}
