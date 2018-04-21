package com.service.lwhtestbuild.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-21T01:39:52.435Z")

@RestSchema(schemaId = "lwhtestbuild")
@RequestMapping(path = "/lwhtestbuild", produces = MediaType.APPLICATION_JSON)
public class LwhtestbuildImpl {

    @Autowired
    private LwhtestbuildDelegate userLwhtestbuildDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLwhtestbuildDelegate.helloworld(name);
    }

}
