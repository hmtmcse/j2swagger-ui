package com.hmtmcse.j2swagger

import spock.lang.Specification

class JavaSwaggerTest extends Specification {

    def "Descriptor Test"() {
        expect: "Will generate All"

        JavaSwagger javaSwagger = new JavaSwagger()

        javaSwagger.addInfo("Java Swagger")
                .setDescription("A short description of the application. [CommonMark syntax](https://spec.commonmark.org/) MAY be used for rich text representation.")
                .setTermsOfService("http://swagger.io/terms/")
                .setContact("HMTMCSE", "developer@hmtmcse.com")
                .setLicense("Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0.html")
                .setVersion("1.0.1")

        javaSwagger.externalDocs("http://swagger.io", "Fiend the External Docs on this link.")
        javaSwagger.servers("https://petstore.swagger.io/v2")
        javaSwagger.servers("https://petstore.swagger.io/v2", "Server Description.")

        println(javaSwagger.getYamlString())

    }

}
