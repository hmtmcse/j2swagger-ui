package com.hmtmcse.j2swagger.data;

public class Schema extends PropertyList<Schema> {

    public Schema(){
        super(Schema.class);
    }

    public Schema(String type, String format) {
        super(Schema.class);
        this.type = type;
        this.format = format;
    }
}
