package com.provider.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProviderController {
    @RequestMapping("/sayHi")
    @ResponseBody
    public String say(HttpServletRequest request){
        return "Hello,我是客户端的："+request.getRemotePort()+"端口"+"我的ContextPath是"+request.getContextPath()+"我的host是"+request.getRemoteHost()+
                "我的addr是"+request.getRemoteAddr()+"我的user是"+request.getRemoteUser();
    }
}
