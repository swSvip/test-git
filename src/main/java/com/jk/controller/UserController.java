package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public  String TestUser(){
        System.out.println("Test!!!!!!!!!!!!!!!!!!!!");
         return "GIT";
    }
}
