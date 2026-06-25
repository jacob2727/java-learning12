package com.JavaCourse.Part2.Inheritance;


public class Inheritance {

    public static void main(String[] args) {
      var box1 = new TextBox();
      var box2 = box1;
      System.out.println(box1.hashCode());
    }
} 