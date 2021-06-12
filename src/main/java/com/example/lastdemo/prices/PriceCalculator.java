package com.example.lastdemo.prices;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import java.sql.Date;

public class PriceCalculator {

    public double priceForRent(long numberOfDys){
        double price=200;
        double sumPrice = 0;
        if (numberOfDys<=2&&numberOfDys>0){
           sumPrice=(price*numberOfDys);
           sumPrice = sumPrice - (sumPrice*0.05);
        }
        else if (numberOfDys>2&&numberOfDys<=5){
            sumPrice=(price*numberOfDys);
            sumPrice = sumPrice - (sumPrice*0.10);
        }
        else if (numberOfDys>5&&numberOfDys<=10){
            sumPrice=(price*numberOfDys);
            sumPrice = sumPrice - (sumPrice*0.15);
        }
        else if (numberOfDys>10){
            sumPrice=(price*numberOfDys);
            sumPrice = sumPrice - (sumPrice*0.20);
        }

        return sumPrice;
    }

}
