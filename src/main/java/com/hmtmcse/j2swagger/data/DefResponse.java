package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.Component;
import com.hmtmcse.j2swagger.common.JSConstant;
import java.util.LinkedHashMap;

public class DefResponse {

    public String description;
    public LinkedHashMap<String, Object> content = new LinkedHashMap<>();
    public LinkedHashMap<String, Header> headers;

    public DefResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Header addHeader(String name){
        if (this.headers == null){
            this.headers = new LinkedHashMap<>();
        }
        this.headers.put(name, new Header());
        return this.headers.get(name);
    }

    public DefResponse json(Component component) {
        LinkedHashMap<String, Schema> json = new LinkedHashMap<>();
        Schema schema = new Schema();
        schema.addRef(component.ref);
        json.put(JSConstant.schema, schema);
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
        LinkedHashMap<String, Schema> xml = new LinkedHashMap<>();
        Schema schema = new Schema();
        schema.addRef(component.ref);
        xml.put(JSConstant.schema, schema);
        content.put(JSConstant.applicationXml, xml);
        return this;
    }


}
