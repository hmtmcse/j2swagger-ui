package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.common.JSConstant;

public class DefRequestBody<T> extends DefParameters<T> {

    public RequestBody requestBody;


    public DefRequestBody(final Class<T> klass){
        super(klass);
        requestBody = new RequestBody();
    }

    public RequestBody xmlRequest(){
        this.requestBody.initNew(JSConstant.applicationXml);
        return this.requestBody;
    }

    public RequestBody jsonRequest(){
        this.requestBody.initNew(JSConstant.applicationJson);
        return this.requestBody;
    }

    public RequestBody formRequest(){
        this.requestBody.initNew(JSConstant.formRequest);
        return this.requestBody;
    }

    public RequestBody multipartRequest(){
        this.requestBody.initNew(JSConstant.multipart);
        return this.requestBody;
    }

}
