package com.Goltsov.Fundamental_Programming;

/*
Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.
 */
public class task4 {
    public static void main(String[] args) {
        double min = Math.nextUp(Double.MIN_VALUE);
        double max_Infinity = Math.nextUp(Double.MAX_VALUE);

        System.out.println(min);
        System.out.println(Double.MIN_VALUE);
        System.out.println();
        System.out.println(max_Infinity);
        System.out.println(Double.MAX_VALUE);
    }
}
