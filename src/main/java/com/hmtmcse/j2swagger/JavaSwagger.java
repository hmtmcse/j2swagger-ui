package com.hmtmcse.j2swagger;

import com.hmtmcse.j2swagger.data.Descriptor;
import com.hmtmcse.j2swagger.data.ExternalDocs;
import com.hmtmcse.j2swagger.data.Info;
import com.hmtmcse.j2swagger.data.Server;

import java.util.ArrayList;

public class JavaSwagger {


    private Descriptor descriptor = new Descriptor();


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



}
