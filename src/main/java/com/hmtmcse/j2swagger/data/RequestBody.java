package com.hmtmcse.j2swagger.data;

import java.util.LinkedHashMap;

public class RequestBody {

    public String description;
    public Boolean required;
    public LinkedHashMap<String, LinkedHashMap<String, Object>> content;
}
