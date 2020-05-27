package com.tdkj.mybatisplus_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("index")
    public String test(String s){
        return s;
    }
}
