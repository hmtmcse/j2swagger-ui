package com.hmtmcse.j2swagger.data;

import java.util.List;

public class Path {

    public List<String> tags;
    public String summary;
    public String description;
    public ExternalDocs externalDocs;
    public String operationId;
    public Boolean deprecated = false;

}
