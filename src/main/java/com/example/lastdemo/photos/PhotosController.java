package com.example.lastdemo.photos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/photos")
public class PhotosController {

    @GetMapping("")
    private String photos(){
        return "photos";
    }
}
