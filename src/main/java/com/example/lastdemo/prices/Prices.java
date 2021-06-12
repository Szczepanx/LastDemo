//package com.example.lastdemo.prices;
//
//import com.example.lastdemo.dates.Dates;
//import com.example.lastdemo.dates.DatesRepository;
//import com.example.lastdemo.user.User;
//
//import javax.persistence.*;
//
//@Entity
//public class Prices {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private double priceForAll;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    private Dates dates;
//
//
//    public Prices() {
//    }
//
//    public Prices(int numberOfDays, double priceForAll) {
//        this.priceForAll = priceForAll;
//    }
//
//    public Prices(Long id, int numberOfDays, double priceForAll) {
//        this.id = id;
//        this.priceForAll = priceForAll;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public Prices setId(Long id) {
//        this.id = id;
//        return this;
//    }
//
//
//    public double getPriceForAll() {
//        Dates dates = new Dates();
//        PriceCalculator priceCalculator = new PriceCalculator();
//
//        double priceForAll = priceCalculator.priceForRent(dates.getNumberOfDates());
//        return priceForAll;
//    }
//
//    public Prices setPriceForAll(double priceForAll) {
//        this.priceForAll = priceForAll;
//        return this;
//    }
//
//    public Prices(Long id, double priceForAll) {
//        this.id = id;
//        this.priceForAll = priceForAll;
//    }
//
//    public Prices(double priceForAll) {
//        this.priceForAll = priceForAll;
//    }
//
//    public Dates getDates() {
//        return dates;
//    }
//
//    public Prices setDates(Dates dates) {
//        this.dates = dates;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return "Prices{" +
//                "id=" + id +
//                ", priceForAll=" + priceForAll +
//                '}';
//    }
//}
