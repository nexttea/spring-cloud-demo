package me.nexttea.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consume")
    @ResponseBody
    public Object consume(){
        Map map = restTemplate.getForObject("http://client/hello/sayHello", Map.class);
        return map;
    }
}
