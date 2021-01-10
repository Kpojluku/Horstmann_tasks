package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Write a program that reads in two integers between 0 and 4294967295,
stores them in int variables, and computes and displays their unsigned
sum, difference, product, quotient, and remainder. Do not convert them
to long values
 */
public class task7 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = (int) Long.parseLong(reader.readLine());
        int b = (int) Long.parseLong(reader.readLine());

        System.out.println("sum: " + (a + b));
        System.out.println("difference: " + (a - b));
        System.out.println("product: " + (a * b));
        System.out.println("quotient: " + (a / b));
        System.out.println("remainder: " + (a % b));


    }
}
