package com.hmtmcse.j2swagger.data;

public class PropertyAttr {

    public String type;
    public String format;
    public String maximum;
    public String minimum;

    public PropertyAttr() {}

    public PropertyAttr(String type, String format) {
        this.type = type;
        this.format = format;
    }

    public PropertyAttr(String type) {
        this.type = type;
    }

    public PropertyAttr setType(String type) {
        this.type = type;
        return this;
    }

    public PropertyAttr setFormat(String format) {
        this.format = format;
        return this;
    }

    public PropertyAttr setMaximum(String maximum) {
        this.maximum = maximum;
        return this;
    }

    public PropertyAttr setMinimum(String minimum) {
        this.minimum = minimum;
        return this;
    }
}
