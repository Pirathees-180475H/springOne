package com.jenKins.jenkinsTrail.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
public class welcomeController {
    Logger logger = LoggerFactory.getLogger(welcomeController.class);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcomeMethod(){
        return "Hello Da Gomtha";
    }


}
