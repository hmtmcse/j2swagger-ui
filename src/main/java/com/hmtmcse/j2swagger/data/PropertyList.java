package com.hmtmcse.j2swagger.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hmtmcse.j2swagger.common.JSConstant;
import java.util.ArrayList;
import java.util.List;

public class PropertyList<T> {

    private T t;

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


    public PropertyList(final Class<T> klass){
        this.t = klass.cast(this);
    }


    public T setType(String type) {
        this.type = type;
        return t;
    }

    public T setFormat(String format) {
        this.format = format;
        return t;
    }

    public T setMaximum(String maximum) {
        this.maximum = maximum;
        return t;
    }

    public T setMinimum(String minimum) {
        this.minimum = minimum;
        return t;
    }

    public T setDefault(Object defaultValue) {
        this.defaultValue = defaultValue;
        return t;
    }

    public T setEnum(List<Object> enumeration) {
        this.enumeration = enumeration;
        return t;
    }

    public T addEnum(Object name) {
        if (this.enumeration == null){
            this.enumeration = new ArrayList<>();
        }
        this.enumeration.add(name);
        return t;
    }

    public T setDescription(String description) {
        this.description = description;
        return t;
    }


    public T setExample(String example) {
        this.example = example;
        return t;
    }

    public T addRef(String ref) {
        this.$ref = ref;
        return t;
    }

    public T addArrayRef(String ref) {
        this.type = JSConstant.array;
        this.items = new Items();
        this.items.addRef(ref);
        return t;
    }

    public T addArray(String type) {
        this.type = JSConstant.array;
        this.type = JSConstant.array;
        this.items = new Items();
        this.items.setType(type);
        return t;
    }

    

}
