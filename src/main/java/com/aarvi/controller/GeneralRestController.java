package com.aarvi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GeneralRestController {

    @RequestMapping(value = "/getServiceName", method = RequestMethod.GET)
    public String getServiceName(){
        return "Aarvi";
    }

}
