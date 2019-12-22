package com.hmtmcse.j2swagger.data;

public class Info {

    public String title;
    public String description;
    public String termsOfService;
    public Contact contact;
    public License license;
    public String version = "1.0.0";

    public Info() {}

    public Info(String title) {
        this.title = title;
    }

    public Info setDescription(String description) {
        this.description = description;
        return this;
    }

    public Info setVersion(String version) {
        this.version = version;
        return this;
    }

    public Info setTitle(String title) {
        this.title = title;
        return this;
    }


    public Info setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
        return this;
    }

    public Info setLicense(String name, String url) {
        this.license = new License(name, url);
        return this;
    }

    public Info setContact(String name, String url, String email) {
        this.contact = new Contact(name, url, email);
        return this;
    }

    public Info setContact(String name, String email) {
        this.contact = new Contact(name, null, email);
        return this;
    }

    public Info setContact(String email) {
        this.contact = new Contact(null, null, email);
        return this;
    }

}
