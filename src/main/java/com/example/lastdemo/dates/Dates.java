package com.example.lastdemo.dates;

import com.example.lastdemo.prices.PriceCalculator;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Entity
public class Dates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private long numberOfDates;
    private double priceForThis;

    public Dates(Long id, Date startDate, Date endDate, long numberOfDates, double priceForThis) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDates = numberOfDates;
        this.priceForThis = priceForThis;
    }


    public Dates(Date startDate, Date endDate, long numberOfDates, double priceForThis) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDates = numberOfDates;
        this.priceForThis = priceForThis;
    }

    public Dates(Date startDate, Date endDate , long numberOfDates) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDates = numberOfDates;
    }

    public Dates(Long id, Date startDate, Date endDate ,long numberOfDates) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDates = numberOfDates;
    }


    public Dates() {
    }

    public double getPriceForThis() {
        PriceCalculator priceCalculator = new PriceCalculator();

        double priceForThis = priceCalculator.priceForRent(getNumberOfDates());
        return priceForThis;
    }

    public Dates setPriceForThis(double priceForThis) {
        this.priceForThis = priceForThis;
        return this;
    }

    public long getNumberOfDates() {
        LocalDate localDate1 = startDate.toLocalDate();
        LocalDate localDate2 = endDate.toLocalDate();

//        long days = ChronoUnit.DAYS.between(localDate1,localDate2);
        return  ChronoUnit.DAYS.between(localDate1,localDate2);
    }

    public Dates setNumberOfDates(long numberOfDates) {
        this.numberOfDates = numberOfDates;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Dates setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Dates setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Dates setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numberOfDates=" + numberOfDates +
                ", priceForThis=" + priceForThis +
                '}';
    }
}
