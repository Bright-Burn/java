package com.company;

public class Main {

    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();
        HomeWork2 homeWork2 = new HomeWork2();
        // homeWork1
        System.out.println("expression: " + homeWork1.expression(1,2,3,4));
        System.out.println("checkRange 10,2: " + homeWork1.checkRange(10,2));
        System.out.println("isPositive 10: " + homeWork1.isPositive(10));
        System.out.println("isNegative 2: " + homeWork1.isNegative(2));
        System.out.println("isLeapYear 10: " + homeWork1.isLeapYear(10));
        System.out.println("isLeapYear 12: " + homeWork1.isLeapYear(12));
        System.out.println("isLeapYear 100: " + homeWork1.isLeapYear(100));
        System.out.println("isLeapYear 1200: " + homeWork1.isLeapYear(1200));
        homeWork1.greeting("Bob");
        homeWork2.task1();
        homeWork2.task2();
        homeWork2.task3();
        homeWork2.task4();
        homeWork2.task5();
        homeWork2.task6(new int[] {1,1,1,2,1});
    }
}
