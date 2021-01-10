package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a program that reads a string and prints all of its nonempty
substrings.
 */
public class task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] split = str.split(" ");
        for(String s: split){
            System.out.println(s);
        }
    }
}
