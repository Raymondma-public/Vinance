package com.ma.raymond.vinance.model;

import com.ma.raymond.vinance.utils.MyMath;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class TestFRA {

    @Test
    public void testSettlment(){
        LocalDate fromDate=LocalDate.of(2019, Month.JUNE,19);
        LocalDate toDate=LocalDate.of(2019,Month.SEPTEMBER,18);
        double fixedRate=0.1285;
        double floatingRate=0.1150;
        FRA fra=new FRA(100,fromDate,toDate,DayCount.Type_ACT_365, fixedRate);
        assertEquals(0.3307, MyMath.round(fra.getSettlmentAmt(floatingRate),4),0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSettlment_ExpectIllegalArgument(){
        LocalDate fromDate=LocalDate.of(2019, Month.JUNE,19);
        LocalDate toDate=LocalDate.of(2018,Month.SEPTEMBER,18);
        double fixedRate=0.1285;
        double floatingRate=0.1150;
        FRA fra=new FRA(100,fromDate,toDate,DayCount.Type_ACT_365, fixedRate);
        MyMath.round(fra.getSettlmentAmt(floatingRate),4);
    }
}
