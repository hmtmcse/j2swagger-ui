package com.hmtmcse.j2swagger;

import com.hmtmcse.j2swagger.common.JSConstant;
import com.hmtmcse.j2swagger.data.PropertyAttr;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class DataTypeDefinition {

    private LinkedHashMap<String, PropertyAttr> map = new LinkedHashMap<>();
    private String tmpName;
    public List<String> requiredList;


    public LinkedHashMap<String, PropertyAttr> propertyList(){
        return this.map;
    }

    public PropertyAttr otherProps() {
        return map.get(tmpName);
    }

    public DataTypeDefinition integer(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.integer, "int64");
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition integer32(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.integer, "int32");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition number(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.number, "double");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition numberFloat(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.number, "float");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition string(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string);
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition stringByte(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string, "byte");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition stringBinary(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string, "binary");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition booleanData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.bolean);
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition dateData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string, "date");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition dateTimeData(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string, "date-time");
        map.put(name, propertyAttr);
        return this;
    }


    public DataTypeDefinition password(String name) {
        this.tmpName = name;
        PropertyAttr propertyAttr = new PropertyAttr(JSConstant.string, "password");
        map.put(name, propertyAttr);
        return this;
    }

    public DataTypeDefinition ref(String name, Component component) {
        this.tmpName = name;
        map.put(name, new PropertyAttr().addRef(component.ref));
        return this;
    }

    public DataTypeDefinition array(String name, Component component) {
        this.tmpName = name;
        map.put(name, new PropertyAttr().addArrayRef(component.ref));
        return this;
    }

    public DataTypeDefinition array(String name, String type) {
        this.tmpName = name;
        map.put(name, new PropertyAttr().addArray(type));
        return this;
    }

    public DataTypeDefinition required() {
        if (this.requiredList == null){
            this.requiredList = new ArrayList<>();
        }
        this.requiredList.add(tmpName);
        return this;
    }

}
