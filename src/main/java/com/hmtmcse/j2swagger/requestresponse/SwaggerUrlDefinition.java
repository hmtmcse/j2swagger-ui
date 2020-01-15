package com.hmtmcse.j2swagger.requestresponse;

import com.hmtmcse.j2swagger.common.JSConstant;
import com.hmtmcse.j2swagger.data.DefPath;
import com.hmtmcse.j2swagger.data.Descriptor;

import java.util.LinkedHashMap;

public class SwaggerUrlDefinition {

    public LinkedHashMap<String, DefPath> path;
    public String url;
    private GetRequestResponse getRequestResponse;
    private PostRequestResponse postRequestResponse;
    private PutRequestResponse putRequestResponse;
    private DeleteRequestResponse deleteRequestResponse;

    public SwaggerUrlDefinition() {}

    public SwaggerUrlDefinition(Descriptor descriptor, String url){
        this.path = new LinkedHashMap<>();
        this.url = url;
        if (descriptor.paths == null){
            descriptor.paths = new LinkedHashMap<>();
        }
        descriptor.paths.put(this.url, this.path);
    }

    public GetRequestResponse getMethod(){
        this.getRequestResponse = new GetRequestResponse();
        this.path.put(JSConstant.get, this.getRequestResponse);
        return this.getRequestResponse;
    }

    public PostRequestResponse postMethod(){
        this.postRequestResponse = new PostRequestResponse();
        this.path.put(JSConstant.post, this.postRequestResponse);
        return this.postRequestResponse;
    }

    public PutRequestResponse putMethod(){
        this.putRequestResponse = new PutRequestResponse();
        this.path.put(JSConstant.put, this.putRequestResponse);
        return this.putRequestResponse;
    }

    public DeleteRequestResponse deleteMethod(){
        this.deleteRequestResponse = new DeleteRequestResponse();
        this.path.put(JSConstant.delete, this.deleteRequestResponse);
        return this.deleteRequestResponse;
    }
}
