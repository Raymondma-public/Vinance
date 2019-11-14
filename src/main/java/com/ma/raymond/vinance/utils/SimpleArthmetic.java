package com.ma.raymond.vinance.utils;

public class SimpleArthmetic {
    private SimpleArthmetic(){}


    public static double npv(double[] cashflow, double fixedRate){
        double npv=0;
        int year=0;
        for(int i=0;i<cashflow.length;i++){
            year=i;
            npv+=cashflow[i]/(Math.pow(1+fixedRate,year));
            System.out.println(npv);
        }
        return npv;
    }

    /***
     *
     * https://en.wikipedia.org/wiki/Brent%27s_method
     * @param cashflow
     * @return Internal Rate of Return
     */
    public static double irr(double[] cashflow){
        return 0;
    }
}
