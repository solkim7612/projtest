package com.example.demoProject.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostDetailController {

    @GetMapping("/PostDetail")
    public String Test(){
        return "PostDetail";
    }

}
