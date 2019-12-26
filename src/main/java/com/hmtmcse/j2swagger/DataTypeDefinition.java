package com.hmtmcse.j2swagger;

import com.hmtmcse.j2swagger.data.PropertyAttr;
import java.util.LinkedHashMap;


public class DataTypeDefinition {

    private LinkedHashMap<String, PropertyAttr> map = new LinkedHashMap<>();
    private String tmpName;


    public PropertyAttr otherProps() {
        return map.get(tmpName);
    }

    public DataTypeDefinition integer(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("integer", "int64");
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition integer32(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("integer", "int32");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition number(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("number", "double");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition numberFloat(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("number", "float");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition stringData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition stringByte(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string", "byte");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition stringBinary(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string", "binary");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition booleanData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("boolean");
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition dateData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string", "date");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition dateTimeData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string", "date-time");
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition password(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr("string", "password");
        map.put(name, propertyAttr);
        return this;
    }


}
