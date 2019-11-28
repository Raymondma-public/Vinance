package com.ma.raymond.vinance.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class IRS {
    private double notional;
    private LocalDate startDate;
    private LocalDate maturityDate;
    private double receiveRate;
    private double payRate;


    private DayCount dayCount;

    public IRS(double notional,LocalDate startDate, LocalDate maturityDate, DayCount dayCount){

    }

//    public double payFix(){
//        return
//    }
//
//    public double payFloating(){
//        return
//    }
//
//    public double markToMarketValue(){
//
//    }
}
