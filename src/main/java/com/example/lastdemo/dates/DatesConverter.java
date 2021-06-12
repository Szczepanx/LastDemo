package com.example.lastdemo.dates;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class DatesConverter {


    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
