package com.example.demoProject.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @GetMapping("/login")
    public  String loginForn(){


        return  "login";
    }


    @PostMapping("/login")
    public  String  login(@RequestParam( name = "id") String id,
                          @RequestParam( name="pw") String pw){


        System.out.println( id + pw);


        return "redirect:/home";
    }


}
