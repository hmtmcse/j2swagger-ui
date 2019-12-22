package com.hmtmcse.j2swagger.data;

public class ExternalDocs {
    public String url;
    public String description;

    public ExternalDocs() {}

    public ExternalDocs(String url, String description) {
        this.description = description;
        this.url = url;
    }
}
