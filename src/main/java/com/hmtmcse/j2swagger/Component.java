package com.hmtmcse.j2swagger;


import com.hmtmcse.j2swagger.common.JSConstant;

public class Component extends DataTypeDefinition {

    public String type = JSConstant.object;
    public String ref;
    public String name;

    public Component() {}

    public Component(String name) {
        this.name = name;
        this.ref = JSConstant.componentSchemasRef + name;
    }

}
