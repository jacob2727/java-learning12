package com.JavaCourse.MorgageCalc;

public class MortgageCalculation {
    private double principal;
    private double rate;
    private byte years;

    public MortgageCalculation(double principal, double rate, byte years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    public double calcMortgage() {
        int payments = years * 12;
        double monthlyInterest = rate / 100 / 12;
        double mortgage = principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, payments))
                / (Math.pow(1 + monthlyInterest, payments) - 1));
        return mortgage;
    }
}
