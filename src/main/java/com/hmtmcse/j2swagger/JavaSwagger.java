package com.hmtmcse.j2swagger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hmtmcse.j2swagger.common.JSConstant;
import com.hmtmcse.j2swagger.data.Descriptor;
import com.hmtmcse.j2swagger.data.ExternalDocs;
import com.hmtmcse.j2swagger.data.Info;
import com.hmtmcse.j2swagger.data.Server;
import com.hmtmcse.j2swagger.requestresponse.SwaggerUrlDefinition;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaSwagger {


    private Descriptor descriptor = new Descriptor();
    private LinkedHashMap<String, Component> schemas;
    private SwaggerUrlDefinition swaggerUrlDefinition;


    public Info addInfo(String title){
        descriptor.info = new Info(title);
        return descriptor.info;
    }

    public JavaSwagger externalDocs(String url, String description) {
        descriptor.externalDocs = new ExternalDocs(url, description);
        return this;
    }

    public JavaSwagger servers(String url, String description) {
        if (descriptor.servers == null) {
            descriptor.servers = new ArrayList<>();
        }
        descriptor.servers.add(new Server(url, description));
        return this;
    }

    public JavaSwagger servers(String url) {
        return servers(url, null);
    }


    public Component addComponentSchema(String name) {
        if (this.schemas == null) {
            this.schemas = new LinkedHashMap<>();
        }
        this.schemas.put(name, new Component(name));
        return this.schemas.get(name);
    }


    public SwaggerUrlDefinition addUrl(String url) {
        this.swaggerUrlDefinition = new SwaggerUrlDefinition(descriptor, url);
        return this.swaggerUrlDefinition;
    }

    public Component addComponentSecurityScheme(String name){
        return null;
    }


    private void copyComponentSchema() {
        if (this.schemas != null) {
            if (descriptor.components == null) {
                descriptor.components = new LinkedHashMap<>();
            }
            descriptor.components.put(JSConstant.schemas, new LinkedHashMap<String, Object>());
            Component component;
            LinkedHashMap<String, Object> componentMap;
            for (Map.Entry<String, Component> entry : schemas.entrySet()) {
                component = entry.getValue();
                componentMap = new LinkedHashMap<>();
                componentMap.put(JSConstant.type, component.type);
                componentMap.put(JSConstant.properties, component.propertyList());
                if (component.requiredList != null) {
                    componentMap.put(JSConstant.required, component.requiredList);
                }
                descriptor.components.get(JSConstant.schemas).put(component.name, componentMap);
            }
        }
    }


//    public String getYamlString() {
//        YamlProcessor yamlProcessor = new YamlProcessor();
//        try {
//            copyComponentSchema();
//            return yamlProcessor.klassToString(descriptor);
//        } catch (Parser4JavaException e) {
//           return null;
//        }
//    }
//
    public String getJsonString() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            copyComponentSchema();
            return mapper.writeValueAsString(descriptor);
        } catch (Exception e) {
            return "";
        }
    }

}
