package com.JavaCourse.Part3.Generics;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("Hello");
        list.add("World");
        for (var item: list) {
            System.out.println(item);
        }
    }
}