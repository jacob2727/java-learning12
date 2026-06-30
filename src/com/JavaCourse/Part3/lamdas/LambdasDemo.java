package com.JavaCourse.Part3.lamdas;

public class LambdasDemo {
    public static void show() {





        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
        }

    private static void greet(Printer printer) {
        printer.print("Hello");
    }
}
