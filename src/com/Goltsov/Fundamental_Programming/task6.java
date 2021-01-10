package com.Goltsov.Fundamental_Programming;

import java.math.BigInteger;

/*
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
BigInteger. Compute the factorial of 1000.
 */
public class task6 {
    public static void main(String[] args) {
        int n = 1000;

        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(big);
    }
}

