package com.hmtmcse.j2swagger.data;

public class Contact {

    public String name;
    public String url;
    public String email;


    public Contact() {}

    public Contact(String email) {
        this.email = email;
    }

    public Contact(String name, String url, String email) {
        this.name = name;
        this.url = url;
        this.email = email;
    }
}
