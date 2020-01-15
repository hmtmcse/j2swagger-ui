package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.Component;
import com.hmtmcse.j2swagger.common.JSConstant;

import java.util.LinkedHashMap;

public class RequestBody {

    public String description;
    public Boolean required;
    public LinkedHashMap<String, LinkedHashMap<String, Schema>> content;
    private String lastContentType;

    public RequestBody() {
    }

    public RequestBody(String contentType) {
        initNew(contentType);
    }

    public RequestBody initNew(String contentType) {
        this.lastContentType = contentType;
        if (this.content == null) {
            this.content = new LinkedHashMap<>();
        }
        this.content.put(contentType, new LinkedHashMap<String, Schema>());
        this.content.get(contentType).put(JSConstant.schema, new Schema());
        return this;
    }

    public RequestBody addRef(Component component) {
        content.get(lastContentType).get(JSConstant.schema).addRef(component.ref);
        return this;
    }

    public RequestBody addArrayRef(Component component) {
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
