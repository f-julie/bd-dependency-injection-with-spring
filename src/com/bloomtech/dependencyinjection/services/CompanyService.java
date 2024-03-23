package com.bloomtech.dependencyinjection.services;

import com.bloomtech.dependencyinjection.models.Company;
import com.bloomtech.dependencyinjection.models.Contact;
import com.bloomtech.dependencyinjection.repositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private CompanyRepo companyRepo;

    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public List<Contact> getContactsByCompanyName(String companyName) {
        return companyRepo.findContacts(companyName);
    }

    public Company getCompanyByName(String name) {
        return companyRepo.findByName(name);
    }
}
