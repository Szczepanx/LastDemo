package com.example.lastdemo.home;

import com.example.lastdemo.dates.Dates;
import com.example.lastdemo.dates.DatesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String home(){
        return "home";
    }



}
