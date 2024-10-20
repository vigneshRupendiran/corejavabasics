package com.corejava.streamz.utils;

public class CurrencyConverter {
    private static final double INR_TO_USD = 0.012;

    public static double currencyConverter(double inrAmount){
        return inrAmount * INR_TO_USD;
    }
}
