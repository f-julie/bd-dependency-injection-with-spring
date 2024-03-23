package com.bloomtech.dependencyinjection.models;

public class Contact {
    private String name;
    private String phonenumber;
    private String address;
    private Company company;

    public Contact() {
    }

    public Contact(String name, String phonenumber, String address, Company company) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.bloomtech.dependencyinjection.models.Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
