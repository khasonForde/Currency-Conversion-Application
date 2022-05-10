package com.example.currencyconversionappbykhasonforde;

public class CurrencyConverter {
    public static double USDtoPounds(double USD){
//Return the result of converting usd from US dollars to British Pounds
        double Pounds = USD * 0.76;
        return Pounds;
    }
    public static double USDtoEuros(double USD){
//Return the result of converting usd from US dollars to Euros
        double Euros = USD * 0.88;
        return Euros;
    }
}

