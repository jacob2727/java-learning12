package com.JavaCourse.Part2.Inheritance;

public class UIControl {
    private boolean isEnabled = true;



    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
