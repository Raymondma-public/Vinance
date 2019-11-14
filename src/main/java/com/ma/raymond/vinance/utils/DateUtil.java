package com.ma.raymond.vinance.utils;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.Set;

public class DateUtil {
    private DateUtil(){
    }

    public static LocalDate startOfMonth(LocalDate date){
        return date.withDayOfMonth(1);
    }
    public static LocalDate endOfMonth(LocalDate date){
        return date.withDayOfMonth(date.lengthOfMonth());
    }
//    public static LocalDate closestBusinessDay(LocalDate date, Set<LocalDate> holidays){
//        int addedDays=0;
//        while(addedDays){
//
//        }
//    }
}
