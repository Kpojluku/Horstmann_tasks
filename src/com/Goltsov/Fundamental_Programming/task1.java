package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 Write a program that reads an integer and prints it in binary, octal, and
hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
 */
public class task1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число в десятичной системе: ");
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Radix 2: " + Integer.toString(number, 2));
        System.out.println("Radix 8: " + Integer.toString(number, 8));
        System.out.println("Radix 16: " + Integer.toString(number, 16));

        System.out.println("a hexadecimal floating-point number: " + Float.toHexString(number));

    }
}
