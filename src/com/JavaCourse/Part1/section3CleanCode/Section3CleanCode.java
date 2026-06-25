package com.JavaCourse.Part1.section3CleanCode;

public class Section3CleanCode {
    public static void main(String[] args) {
        String greeting = greetUser("Jacob", "Leedle");
        System.out.println(greeting);
    }

    public static String greetUser(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName+"!!";
    }
}

