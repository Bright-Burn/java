package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("expression: " + expression(1,2,3,4));
        System.out.println("checkRange 10,2: " + checkRange(10,2));
        System.out.println("isPositive 10: " + isPositive(10));
        System.out.println("isNegative 2: " + isNegative(2));
        System.out.println("isLeapYear 10: " + isLeapYear(10));
        System.out.println("isLeapYear 12: " + isLeapYear(12));
        System.out.println("isLeapYear 100: " + isLeapYear(100));
        System.out.println("isLeapYear 1200: " + isLeapYear(1200));
        greeting("Bob");
    }
    static double expression(float a,float b,float c,float d) {
        return a*(b+(c/d));
    }
    static boolean checkRange(float a, float b) {
        float sum = a + b;
        return sum > 10 && sum < 20;
    }
    static boolean isPositive(int a) {
        return a >= 0;
    }
    static boolean isNegative(int a) {
        return a <= 0;
    }
    static void greeting(String name) {
        System.out.println("Привет, " + name);
    }
    static boolean isLeapYear(int year) {
        if(year % 4 != 0 ) {
            return false;
        }
        return year % 100 != 0 || year % 400 == 0;
    }
}
