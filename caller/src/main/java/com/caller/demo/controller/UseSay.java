package com.caller.demo.controller;

import com.caller.demo.feignclient.SayHelloCaller;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UseSay {
    @Autowired
    SayHelloCaller sayHelloCaller;
    @RequestMapping("/sayMethod")
    @ResponseBody
    public String use(){
        return sayHelloCaller.sayHello();
    }
}
