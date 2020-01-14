package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.common.JSConstant;

import java.util.LinkedHashMap;
import java.util.List;

public class DefParameters<T> extends DefPath<T> {

    public List<Parameter> parameters;

    public DefParameters(final Class<T> klass) {
        super(klass);
    }

    public DefResponse response400() {
        return this.addResponse(JSConstant.R400);
    }

    public DefResponse response404() {
        return this.addResponse(JSConstant.R404);
    }

    public DefResponse response405() {
        return this.addResponse(JSConstant.R405);
    }

    public DefResponse response500() {
        return this.addResponse(JSConstant.R500);
    }

    public DefResponse response200() {
        return this.addResponse(JSConstant.R200);
    }

    public DefResponse response201() {
        return this.addResponse(JSConstant.R201);
    }

}
