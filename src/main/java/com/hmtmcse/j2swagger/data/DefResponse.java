package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.Component;
import com.hmtmcse.j2swagger.common.JSConstant;
import java.util.LinkedHashMap;

public class DefResponse {

    public String description;
    public LinkedHashMap<String, Object> content = new LinkedHashMap<>();

    public DefResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public DefResponse json(Component component) {
        LinkedHashMap<String, Schema> json = new LinkedHashMap<>();
        json.put(JSConstant.schema, new Schema());
        content.put(JSConstant.applicationJson, json);
        return this;
    }

    public DefResponse jsonArray(Component component) {
        LinkedHashMap<String, Schema> json = new LinkedHashMap<>();
        Schema schema = new Schema();
        schema.addArrayRef(component.ref);
        json.put(JSConstant.schema, schema);
        content.put(JSConstant.applicationJson, json);
        return this;
    }

    public DefResponse jsonWithSchema(Schema schema) {
        LinkedHashMap<String, Schema> json = new LinkedHashMap<>();
        json.put(JSConstant.schema, schema);
        content.put(JSConstant.applicationJson, json);
        return this;
    }

    public DefResponse xml(Component component) {
        LinkedHashMap<String, Schema> schema = new LinkedHashMap<>();
        schema.put(JSConstant.schema, new Schema());
        content.put(JSConstant.applicationXml, schema);
        return this;
    }


}
