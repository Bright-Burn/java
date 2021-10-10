package com.company;

public class HomeWork1 {
    public double expression(float a,float b,float c,float d) {
        return a*(b+(c/d));
    }
    public boolean checkRange(float a, float b) {
        float sum = a + b;
        return sum > 10 && sum < 20;
    }
    public boolean isPositive(int a) {
        return a >= 0;
    }
    public boolean isNegative(int a) {
        return a <= 0;
    }
    public void greeting(String name) {
        System.out.println("Привет, " + name);
    }
    public boolean isLeapYear(int year) {
        if(year % 4 != 0 ) {
            return false;
        }
        return year % 100 != 0 || year % 400 == 0;
    }
}
