package com.ma.raymond.vinance.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSimpleArthmetic {

    //https://www.mathworks.com/help/finance/pvvar.html
    @Test
    public void testNPV() {
        double[] cashflow=new double[]{-10000,2000.0,1500.0,3000.0,3800.0,5000.0};
        double fixedRate=0.08;

        assertEquals(1715.39,MyMath.round(SimpleArthmetic.npv(cashflow,fixedRate),2),0);
    }

}

