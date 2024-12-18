package com.example.demoProject.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostAll {

    @GetMapping("/postAll")
    public String postAll(){
        return "postAll";
    }
}
