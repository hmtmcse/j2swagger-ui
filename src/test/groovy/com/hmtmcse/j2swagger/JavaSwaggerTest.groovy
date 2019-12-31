package com.hmtmcse.j2swagger

import com.hmtmcse.j2swagger.common.JSConstant
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


        Component order = javaSwagger.addComponentSchema("Order")
        order.integer("id")
        order.integer("petId")
        order.integer32("quantity")
        order.dateTimeData("shipDate")
        order.string("status")
                .otherProps()
                .addEnum("placed")
                .addEnum("approved")
                .addEnum("delivered")
                .setDescription("Order Status")
        order.booleanData("complete").otherProps().setDefault(false)


        Component pet = javaSwagger.addComponentSchema("Pet")
        pet.integer("id")
        pet.string("name").required().otherProps().setExample("doggie")
        pet.array("photoUrls", JSConstant.string).required()
        order.string("status")
                .otherProps()
                .setDescription("pet status in the store")
                .addEnum("available")
                .addEnum("pending")
                .addEnum("sold")

        println(javaSwagger.getYamlString())

    }

}
