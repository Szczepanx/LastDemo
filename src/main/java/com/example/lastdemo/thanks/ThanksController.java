package com.example.lastdemo.thanks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThanksController {

    @GetMapping("/thanks")
    public String getThanks(){
        return "thanks";
    }
}
