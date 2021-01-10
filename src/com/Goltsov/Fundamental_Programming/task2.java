package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.
 */
public class task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите угол: ");
        int angle = Integer.parseInt(reader.readLine());
        int pi = 360;
        System.out.println("% : " + (angle % pi + pi) % pi);
        System.out.println("floorMod: " + Math.floorMod(angle, pi));

    }
}
