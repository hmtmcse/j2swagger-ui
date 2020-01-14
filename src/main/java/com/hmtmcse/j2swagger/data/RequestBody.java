package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.Component;
import com.hmtmcse.j2swagger.common.JSConstant;

import java.util.LinkedHashMap;

public class RequestBody {

    public String description;
    public Boolean required;
    public LinkedHashMap<String, LinkedHashMap<String, Schema>> content;
    private String lastContentType;

    public RequestBody() {}

    public RequestBody(String contentType) {
        this.lastContentType = contentType;
        this.content = new LinkedHashMap<>();
        this.content.put(contentType, new LinkedHashMap<>());
        this.content.get(contentType).put(JSConstant.schema, new Schema());
    }

    public RequestBody addRef(Component component){
        content.get(lastContentType).get(JSConstant.schema).addRef(component.ref);
        return this;
    }

    public RequestBody addArrayRef(Component component){
        content.get(lastContentType).get(JSConstant.schema).addArrayRef(component.ref);
        return this;
    }

    public RequestBody setDescription(String description) {
        this.description = description;
        return this;
    }

    public RequestBody setRequired() {
        this.required = true;
        return this;
    }
}
