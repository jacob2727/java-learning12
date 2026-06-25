package com.JavaCourse.MorgageCalc;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max) {

        System.out.print(prompt);
        double value = scanner.nextDouble();
        while (value < min || value > max) { //input between min and max
            System.out.println("Please enter a valid input larger than " + min + " and smaller than " + max);
            System.out.print(prompt);
            value = scanner.nextDouble();
        }
        return value;
    }
}
