package com.reno.collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qxl19 on 2018/5/12.
 */
@Controller
public class MyFirstCollection {
    @RequestMapping("/test1")
    @ResponseBody
    public String test(){
        return "hi!";
    }
}
