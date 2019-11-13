package com.ma.raymond.vinance.model;

public enum DayCount {
    Type_30_360(360),
    Type_ACT_365(365),
    Type_ACT_360(360);

    public final int base;
    DayCount(int base){
        this.base=base;
    }
}
