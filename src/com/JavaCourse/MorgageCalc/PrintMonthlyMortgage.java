package com.JavaCourse.MorgageCalc;

import java.text.NumberFormat;

public class PrintMonthlyMortgage {
    public static void calcMonthByMonth(double principal, double monthlyRate, double totalPayments) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        for (int paymentNumber = 1; paymentNumber <= totalPayments; paymentNumber++) {
            double num =
                    (principal * (Math.pow((1 + monthlyRate), totalPayments) - Math.pow((1 + monthlyRate), paymentNumber))
                            / (Math.pow((1 + monthlyRate), totalPayments) - 1));
            System.out.println(currency.format(num));
        }

    }
}
