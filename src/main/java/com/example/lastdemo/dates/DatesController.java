package com.example.lastdemo.dates;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DatesController {
    final private DatesRepository datesRepository;

    @GetMapping("/list")
    @ResponseBody
    public String list() {
        List<Dates> dates = datesRepository.findAll();
        return dates.stream()
                .map(Dates::toString)
                .collect(Collectors.joining("</div><div>", "<div>", "</div>"));
    }

    public DatesController(DatesRepository datesRepository) {
        this.datesRepository = datesRepository;
    }
    @GetMapping("/dates")
    public String displayDates(Model model){
        model.addAttribute("dates", new Dates());
        return "dates";
    }


    @PostMapping("/dates")
    private String datesFromForm(@ModelAttribute Dates dates){
        dates.setPriceForThis(dates.getPriceForThis());
        dates.setNumberOfDates(dates.getNumberOfDates());
        datesRepository.save(dates);
        return "redirect:/my/user";
    }

}
