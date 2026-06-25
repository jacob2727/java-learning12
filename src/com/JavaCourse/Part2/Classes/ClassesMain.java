package com.JavaCourse.Part2.Classes;


import java.text.NumberFormat;

public class ClassesMain {
    public static void main(String[] args) {

        var numberFormat = NumberFormat.getCurrencyInstance();
        var employee = new Employee(50_000, 10);
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(10); 
       int wage =  employee.calculateWage(10);
        System.out.println(numberFormat.format(wage));

    }

}