package com.JavaCourse.Practice;

public class calclateTip {

    private double total;
    private double tipPercent;

    public calclateTip(double total, double tipPercent) {
        this.total = total;
        this.tipPercent = tipPercent;
    }

    public double findTotal() {
        return findTip() + total;
    }

    private double findTip() {
        return total * (tipPercent/100);
    }

    public double getTip() {
        return findTip();
    }
}
