package com.example.demoProject.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class reviewAll {

    @GetMapping("/reviewAll")
    public String reviewAll1(){
        return "reviewAll";
    }
}
