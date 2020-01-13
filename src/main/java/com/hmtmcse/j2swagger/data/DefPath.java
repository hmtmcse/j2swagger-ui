package com.hmtmcse.j2swagger.data;

import com.hmtmcse.tmutil.TomTom;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DefPath<T> {

    private T t;
    public List<String> tags;
    public String summary;
    public String description;
    public ExternalDocs externalDocs;
    public String operationId = TomTom.random15Char();
    public Boolean deprecated = false;
    public LinkedHashMap<String, DefResponse> responses;

    public DefPath(final Class<T> klass){
        this.t = klass.cast(this);
    }

    public T setSummary(String summary) {
        this.summary = summary;
        return t;
    }

    public T setDescription(String description) {
        this.description = description;
        return t;
    }

    public T setExternalDocs(String url, String descriptions) {
        this.externalDocs = new ExternalDocs(url, description);
        return t;
    }

    public T setOperationId(String operationId) {
        this.operationId = operationId;
        return t;
    }

    public T setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return t;
    }

    public T setTags(List<String> tags) {
        this.tags = tags;
        return t;
    }

    public T addTags(String tag) {
        if (this.tags == null){
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
        return t;
    }

    public DefResponse addResponse(String responseCode){
        if (this.responses == null){
            this.responses = new LinkedHashMap<>();
        }
        this.responses.put(responseCode, new DefResponse());
        return this.responses.get(responseCode);
    }
}
