package com.sdut.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Lenovo
 * Date: 2018/5/7
 * Time: 21:54
 * Version:V1.0
 */
@Controller
@Scope("prototype")
@RequestMapping("cms/index")
public class Index {

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
}

