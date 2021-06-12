package com.example.lastdemo.description;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/description")
public class DescriptionController {


    @GetMapping("")
    public String description(){
        return "description";
    }
}
