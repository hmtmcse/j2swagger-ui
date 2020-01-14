package com.hmtmcse.j2swagger.data;

import java.util.List;

public class DefParameters<T> extends DefPath<T> {

    public List<Parameter> parameters;

    public DefParameters(final Class<T> klass){
        super(klass);
    }

}
