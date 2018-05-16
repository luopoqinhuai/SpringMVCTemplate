package com.reno.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wudan on 2018/5/16.
 */
@RestController
public class MyRestFullController {
    @RequestMapping("/search")
    public String searchSomething(@RequestParam("name") String name){
        return "hi "+name;
    }
}
