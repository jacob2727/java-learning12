package com.JavaCourse.MorgageCalc;

import java.text.NumberFormat;

public class MortgageCalculator {



    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        double principal = Console.readNumber("Principal ($1K - $1M): ", 1_000,1_000_000);
        double rate = Console.readNumber("rate (percent): ", 1,30);
        byte years = (byte)(Console.readNumber("Years: ", 1,30));
        var calculator = new MortgageCalculation(principal, rate, years);
        double mortgage = calculator.calcMortgage();

        System.out.println("Your mortgage rate is " + numberFormat.format(mortgage));
        PrintMonthlyMortgage.calcMonthByMonth(principal, (rate/100/12),(years*12));
    }

}