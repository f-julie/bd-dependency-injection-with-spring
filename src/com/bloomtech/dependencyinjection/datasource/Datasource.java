package com.bloomtech.dependencyinjection.datasource;

import com.bloomtech.dependencyinjection.models.Company;
import com.bloomtech.dependencyinjection.models.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Datasource {
    public final List<Contact> contactData = new ArrayList<>();
    public final List<Company> companyData = new ArrayList<>();

    public Datasource() {
        Company company1 = new Company("Grant Inc");
        Company company2 = new Company("Baily PLC");

        companyData.add(company1);
        companyData.add(company2);

        Contact contact1 = new Contact("Musab Singh", "111-123-1322", "2212 Quiet Valley Lane", company1);
        Contact contact2 = new Contact("Nellie Coles", "222-123-3654", "1018 Sunny Glen Lane", company1);
        Contact contact3 = new Contact("Denise Herra", "333-213-3215", "526 Mattson Street", company2);

        contactData.add(contact1);
        contactData.add(contact2);
        contactData.add(contact3);
    }
}
