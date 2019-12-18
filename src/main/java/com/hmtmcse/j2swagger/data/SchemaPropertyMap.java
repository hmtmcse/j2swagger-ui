package com.hmtmcse.j2swagger.data;

import java.util.LinkedHashMap;
import java.util.List;

public class SchemaPropertyMap {

    private LinkedHashMap<String, Object> map = new LinkedHashMap<>();


    public LinkedHashMap<String, Object> getMap(){
        return this.map;
    }

    public SchemaPropertyMap type(String type){
        this.map.put("type", type);
        return this;
    }

    public SchemaPropertyMap format(String format){
        this.map.put("format", format);
        return this;
    }

    public SchemaPropertyMap description(String description){
        this.map.put("description", description);
        return this;
    }

    public SchemaPropertyMap enums(List<Object> enums){
        this.map.put("enum", enums);
        return this;
    }


    public SchemaPropertyMap defaultValue(Object value){
        this.map.put("default", value);
        return this;
    }

    public SchemaPropertyMap $ref(String $ref){
        this.map.put("$ref", $ref);
        return this;
    }

    public SchemaPropertyMap maximum(String maximum){
        this.map.put("maximum", maximum);
        return this;
    }


    public SchemaPropertyMap title(String title){
        this.map.put("title", title);
        return this;
    }


    public SchemaPropertyMap minimum(String minimum){
        this.map.put("minimum", minimum);
        return this;
    }



}
