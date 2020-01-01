package com.hmtmcse.j2swagger.data;

public class Header {

    public String description;
    public Schema schema = new Schema();

    public Header setDescription(String description) {
        this.description = description;
        return this;
    }


}
