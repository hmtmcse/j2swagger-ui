package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.common.JSConstant;

public class DefRequestBody<T> extends DefParameters<T> {

    public RequestBody requestBody;


    public DefRequestBody(final Class<T> klass){
        super(klass);
    }

    public RequestBody jsonRequest(){
        this.requestBody = new RequestBody(JSConstant.applicationJson);
        return this.requestBody;
    }

    public RequestBody formRequest(){
        this.requestBody = new RequestBody(JSConstant.formRequest);
        return this.requestBody;
    }

    public RequestBody multipartRequest(){
        this.requestBody = new RequestBody(JSConstant.multipart);
        return this.requestBody;
    }

}
