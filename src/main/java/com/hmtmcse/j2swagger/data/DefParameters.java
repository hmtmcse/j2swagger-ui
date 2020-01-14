package com.hmtmcse.j2swagger.data;

import com.hmtmcse.j2swagger.common.JSConstant;

import java.util.ArrayList;
import java.util.List;

public class DefParameters<T> extends DefPath<T> {

    public List<Parameter> parameters;
    private Parameter lastParams;

    private void initParameters(){
        if (this.parameters == null){
            this.parameters = new ArrayList<>();
        }
    }

    public Parameter addQueryParam(String name) {
        this.initParameters();
        lastParams = new Parameter();
        lastParams.setIn(ParameterIn.query);
        lastParams.setName(name);
        parameters.add(lastParams);
        return lastParams;
    }


    public DefParameters(final Class<T> klass) {
        super(klass);
    }

    public DefResponse response400(String description) {
        return this.addResponse(JSConstant.R400).setDescription(description);
    }

    public DefResponse response404(String description) {
        return this.addResponse(JSConstant.R404).setDescription(description);
    }

    public DefResponse response405(String description) {
        return this.addResponse(JSConstant.R405).setDescription(description);
    }

    public DefResponse response500(String description) {
        return this.addResponse(JSConstant.R500).setDescription(description);
    }

    public DefResponse response200(String description) {
        return this.addResponse(JSConstant.R200);
    }

    public DefResponse response201() {
        return this.addResponse(JSConstant.R201);
    }

}
