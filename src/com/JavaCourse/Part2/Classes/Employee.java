package com.JavaCourse.Part2.Classes;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public Employee(int BaseSalary, int HourlyRate) {
        this.baseSalary = BaseSalary;
        this.hourlyRate = HourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

  

    public void setBaseSalary(int baseSalary) {
        if  (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0.00");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be greater than 0.00");

        }
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }


    private int getHourlyRate() {
        return hourlyRate;
    }
}
