package com.ma.raymond.vinance.model;

import java.time.LocalDate;

public class IRF {
    private double notional;
    private LocalDate fromDate;
    private LocalDate toDate;
    private double last;

    private long days;
    private long year;
    private DayCount dayCount;

    private double fixedRate;
}
