package com.JavaCourse.Practice;

import java.util.Scanner;

public class readNumber {
    public static double validateInputNumber(String prompt, int min, int max) {
        var scanner = new Scanner(System.in);
        System.out.print(prompt);
        double userInput = scanner.nextInt();
        while (userInput > max || userInput < min) {
            System.out.println("Please enter a number between " + min + " and " + max);
            System.out.print(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }
}
