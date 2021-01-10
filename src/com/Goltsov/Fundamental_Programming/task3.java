package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Using only the conditional operator, write a program that reads three
integers and prints the largest. Repeat with Math.max.
 */
public class task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("max value: " + max);
        System.out.println("with Math.max: " + Math.max(c, Math.max(a, b)));
    }
}
