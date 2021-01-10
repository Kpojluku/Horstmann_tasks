package com.Goltsov.Fundamental_Programming;
/*
Section 1.5.3, “String Comparison” (page 25) has an example of two strings
s and t so that s.equals(t) but s != t. Come up with a different example
that doesn’t use substring).
 */
public class task9 {
    public static void main(String[] args) {
        String s1 = "wor";
        String s2 = "ld";
        System.out.println("world".equals(s1+s2));//true
        System.out.println("world"==(s1+s2));//false
    }
}
