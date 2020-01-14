package com.hmtmcse.j2swagger.data;

public class Parameter {

    public String name;
    public String description;
    public ParameterIn in;
    public Boolean required;
    public Boolean deprecated;
    public Boolean allowEmptyValue;
    public Schema schema;

    public Parameter setName(String name) {
        this.name = name;
        return this;
    }

    public Parameter setDescription(String description) {
        this.description = description;
        return this;
    }

    public Parameter setIn(ParameterIn in) {
        this.in = in;
        return this;
    }

    public Parameter setRequired() {
        this.required = true;
        return this;
    }

    public Parameter setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    public Parameter setAllowEmptyValue(Boolean allowEmptyValue) {
        this.allowEmptyValue = allowEmptyValue;
        return this;
    }

    public Parameter setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
}
