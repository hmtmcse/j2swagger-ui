package com.hmtmcse.j2swagger;

import com.hmtmcse.j2swagger.data.DefPath;
import com.hmtmcse.j2swagger.data.DefRequest;
import com.hmtmcse.j2swagger.data.DefResponse;
import com.hmtmcse.j2swagger.requestresponse.GetRequestResponse;

import java.util.LinkedHashMap;

public class RequestResponse {

    private DefRequest request;
    private DefResponse response;
    private DefPath path;
    private LinkedHashMap<String, DefPath> methods;


    public GetRequestResponse get() {
        return null;
    }



}
