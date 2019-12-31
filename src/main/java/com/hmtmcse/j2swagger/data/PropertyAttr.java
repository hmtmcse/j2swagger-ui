package com.hmtmcse.j2swagger.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hmtmcse.j2swagger.common.JSConstant;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PropertyAttr {

    public String type;
    public String format;
    public String maximum;
    public String minimum;
    public String description;
    public String example;
    public String $ref;

    public Items items;

    @JsonProperty("default")
    public Object defaultValue;

    @JsonProperty("enum")
    public List<Object> enumeration;


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

    public PropertyAttr setDefault(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public PropertyAttr setEnum(List<Object> enumeration) {
        this.enumeration = enumeration;
        return this;
    }

    public PropertyAttr addEnum(Object name) {
        if (this.enumeration == null){
            this.enumeration = new ArrayList<>();
        }
        this.enumeration.add(name);
        return this;
    }

    public PropertyAttr setDescription(String description) {
        this.description = description;
        return this;
    }


    public PropertyAttr setExample(String example) {
        this.example = example;
        return this;
    }

    public PropertyAttr addRef(String ref) {
        this.$ref = ref;
        return this;
    }

    public PropertyAttr addArrayRef(String ref) {
        this.type = JSConstant.array;
        this.items = new Items();
        this.items.addRef(ref);
        return this;
    }

    public PropertyAttr addArray(String type) {
        this.type = JSConstant.array;
        this.type = JSConstant.array;
        this.items = new Items();
        this.items.setType(type);
        return this;
    }


}
