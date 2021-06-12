package com.example.lastdemo.place;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Controller
@RequestMapping("/place")
public class PlaceController {
    final private  PlaceRepository placeRepository;

    public PlaceController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @GetMapping("")
    public String grtPlace(Model model){
        model.addAttribute("place");
        return "place";
    }

    @PostMapping("")
    public String placeForm(@ModelAttribute(name="place") Place place){
        place = new Place("Kakow", "Madalinskiego" , 3);
        placeRepository.save(place);
        return "redirect:/my/user";

    }
}
