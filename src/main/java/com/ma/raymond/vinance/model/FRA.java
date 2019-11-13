package com.ma.raymond.vinance.model;

import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.DAYS;

public class FRA {
    private double notional;
    private LocalDate fromDate;
    private LocalDate toDate;
    private long days;
    private long year;
    private DayCount dayCount;
    private double fixedRate;

    public FRA(double notional, LocalDate fromDate, LocalDate toDate,  DayCount dayCount, double fixedRate) {
        this.notional = notional;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.days = DAYS.between(fromDate,toDate)+1;
        this.year = dayCount.base;
        this.dayCount = dayCount;
        this.fixedRate = fixedRate;
        System.out.println(days+" Days");
        if(days<=0){
            throw new IllegalArgumentException("Date range <= 0 days");
        }
    }

    public double getSettlmentAmt(double floatingRate){
        System.out.println(notional+" "+ fixedRate+" "+floatingRate+" "+days+" "+year);
        double top=notional*(fixedRate-floatingRate)*days/(double)year;
        double bottom=(1+floatingRate*days/(double)year);
        System.out.println(top);
        System.out.println(bottom);
        return top/bottom;
    }
}
