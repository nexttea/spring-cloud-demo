package me.nexttea.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class HelloController {


    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/sayHello")
    @ResponseBody
    public Map sayHello(){
        Map resultMap = new HashMap<String,Object>();
        resultMap.put("clientId",1);
        resultMap.put("msg","hello");
        return resultMap;
    }
}
