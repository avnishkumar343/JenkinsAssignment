package com.JenkinsAssignment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String getHome(){
        return "Welcome to DevOps Jenkins Assignment";
    }

    @GetMapping(value = "/date")
    public String getHomeWithDate(){
        return "Welcome to DevOps Jenkins Assignment" +new Date();
    }
}
