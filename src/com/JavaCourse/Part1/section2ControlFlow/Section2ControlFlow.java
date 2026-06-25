//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.JavaCourse.Part1.section2ControlFlow;

public class Section2ControlFlow {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Mango","Orange"};
        for (int i = 0; i<fruits.length;i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}





////fizz buzz exercise
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your number: ");
//        int userNumber = scanner.nextInt();
//        if ((userNumber % 5 == 0) && (userNumber % 3 == 0)) {
//            System.out.println("FizzBuzz");
//        } else if (userNumber % 5 == 0) {
//            System.out.println("Fizz");
//        } else if (userNumber % 3 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(userNumber);
//        }
//    }
//}