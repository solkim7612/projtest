package com.example.demoProject.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostRegister {

    @GetMapping("/postRegister")
    public String PostRegister1(){
        return "postRegister";
    }
}
