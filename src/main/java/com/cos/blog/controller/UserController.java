package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({"", "/"})
    public String index(){
        return "index";
    }

    @GetMapping("/user/joinForm")
    public String join(){
        return "user/joinForm";
    }

    @GetMapping("/user/loginForm")
    public String login(){
        return "user/loginForm";
    }

}
