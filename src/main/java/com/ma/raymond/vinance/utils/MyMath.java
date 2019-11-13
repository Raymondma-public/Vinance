package com.ma.raymond.vinance.utils;

public class MyMath {
    private MyMath(){
    }

    public static double round(double value, int precision){
        if(precision<0){
            throw new IllegalArgumentException("Invalid precision: "+precision);
        }
        double base=1;
        for(int i=0;i<precision;i++){
            base*=10;
        }
        return Math.round(value* base) / base;

    }
}
