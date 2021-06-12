package com.example.lastdemo.user;


import com.example.lastdemo.dates.Dates;
import com.example.lastdemo.dates.DatesRepository;
import com.example.lastdemo.place.Place;
import com.example.lastdemo.place.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/my")
public class UserController {



    UserRepository userRepository;

    DatesRepository datesRepository;

    PlaceRepository placeRepository;

    public UserController(UserRepository userRepository, DatesRepository datesRepository, PlaceRepository placeRepository) {
        this.userRepository = userRepository;
        this.datesRepository = datesRepository;
        this.placeRepository = placeRepository;
    }

    @GetMapping("/user")
    public String displayDates(Model model){
        model.addAttribute("user", new User());
        return "user";
    }



    @PostMapping("/user")
    private String datesFromForm(@ModelAttribute(name = "user") @Valid User user, BindingResult result){
            if (result.hasErrors()) {
                return "/user";
            }
        userRepository.save(user);
        return "redirect:/thanks";
    }

    @ModelAttribute("place")
    public List<Place> place() {
        return placeRepository.findAll();
    }

    @ModelAttribute("dates")
    public List<Dates> dates() {
        return datesRepository.findAll();
    }
}

