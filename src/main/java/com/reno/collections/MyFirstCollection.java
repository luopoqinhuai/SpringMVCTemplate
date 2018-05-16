package com.reno.collections;

import com.reno.wechat.WechatService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qxl19 on 2018/5/12.
 */
@Controller
public class MyFirstCollection {

    private static  Logger LOGGER = Logger.getLogger(MyFirstCollection.class);

    @RequestMapping("/test1")
    @ResponseBody
    public String test(){
        return "hi!";
    }


    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        LOGGER.info("hahahha");
        return WechatService.getRootPath();
    }


}
