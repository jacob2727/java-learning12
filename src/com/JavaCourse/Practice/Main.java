package com.JavaCourse.Practice;

import java.util.Scanner;

import static com.JavaCourse.Practice.readNumber.validateInputNumber;

public class Main {

    public static void main(String[] args) {
        double percentTip =  readNumber.validateInputNumber("Tip (Percent): ", 0, 100);
        double billTotal = readNumber.validateInputNumber("Bill Total: ", 1, 100_000);
        System.out.println(percentTip);
    }


}