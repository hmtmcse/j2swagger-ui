package com.hmtmcse.j2swagger.requestresponse;

import com.hmtmcse.j2swagger.data.DefPath;
import com.hmtmcse.j2swagger.data.Descriptor;

import java.util.LinkedHashMap;

public class UrlDefinition {

    public LinkedHashMap<String, DefPath> path;
    public String url;

    public UrlDefinition() {}

    public UrlDefinition(Descriptor descriptor, String url){
        this.path = new LinkedHashMap<>();
        this.url = url;
        if (descriptor.paths == null){
            descriptor.paths = new LinkedHashMap<>();
        }
        descriptor.paths.put(this.url, this.path);
    }

    public GetRequestResponse getMethod(){
        return null;
    }

    public PostRequestResponse postMethod(){
        return null;
    }

    public PutRequestResponse putMethod(){
        return null;
    }

    public DeleteRequestResponse deleteMethod(){
        return null;
    }
}
