package com.hmtmcse.j2swagger.data;

public class PropertyAttr extends PropertyList<PropertyAttr> {


    public PropertyAttr() {
        super(PropertyAttr.class);
    }

    public PropertyAttr(String type, String format) {
        super(PropertyAttr.class);
        this.type = type;
        this.format = format;
    }

    public PropertyAttr(String type) {
        super(PropertyAttr.class);
        this.type = type;
    }

}
