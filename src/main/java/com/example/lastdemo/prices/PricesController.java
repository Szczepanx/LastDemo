//package com.example.lastdemo.prices;
//
//import com.example.lastdemo.dates.Dates;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//@Controller
//@RequestMapping("/prices")
//public class PricesController {
//
//
//
//    PricesRepository pricesRepository;
//
//    public PricesController(PricesRepository pricesRepository) {
//        this.pricesRepository = pricesRepository;
//    }
//
//    @GetMapping("")
//    private String prices (){
//        return "prices";
//    }
//
//    @PostMapping("")
//    private String pricesPost (@ModelAttribute Prices prices){
//        Dates dates = new Dates();
//        prices.setDates(dates);
//        prices.getPriceForAll();
//        pricesRepository.save(prices);
//        return prices.toString();
//    }
//}
