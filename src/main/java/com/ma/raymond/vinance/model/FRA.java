package com.ma.raymond.vinance.model;

import java.time.LocalDate;
import java.time.Period;

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
        this.days = Period.between(fromDate,toDate).getDays();
        this.year = dayCount.base;
        this.dayCount = dayCount;
        this.fixedRate = fixedRate;
    }

    public double getSettlmentAmt(double floatingRate){
        return 0.0;
    }
}
