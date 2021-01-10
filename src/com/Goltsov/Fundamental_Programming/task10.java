package com.Goltsov.Fundamental_Programming;

import java.util.Random;

/*
Write a program that produces a random string of letters and digits by
generating a random long value and printing it in base 36.
 */
public class task10 {
    public static void main(String[] args) {
        Random r = new java.util.Random ();
        System.out.println(Long.toString (r.nextLong() & Long.MAX_VALUE, 36));

    }
}
