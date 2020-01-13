package com.hmtmcse.j2swagger.requestresponse;

import com.hmtmcse.j2swagger.data.DefPath;
import com.hmtmcse.j2swagger.data.Parameter;
import java.util.List;

public class GetRequestResponse extends DefPath<GetRequestResponse> {


    public List<Parameter> parameters;

    public GetRequestResponse() {
        super(GetRequestResponse.class);
    }



}
