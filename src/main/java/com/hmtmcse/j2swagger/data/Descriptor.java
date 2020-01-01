package com.hmtmcse.j2swagger.data;

import java.util.LinkedHashMap;
import java.util.List;

public class Descriptor {

    public String openapi = "3.0.1";
    public Info info;
    public ExternalDocs externalDocs;
    public List<Server> servers;
    public List<Tag> tags;
    public LinkedHashMap<String, LinkedHashMap<String, DefPath>> paths;
    public LinkedHashMap<String, LinkedHashMap<String, Object>> components;

}
