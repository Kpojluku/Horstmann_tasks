package com.Goltsov.Fundamental_Programming;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.
 */
public class task13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i<=49; i++){
            list.add(i);
        }

        int[] result = new int[6];
        for (int i = 0; i < 6; i++){
            result[i] = list.remove((int)((48-i)*Math.random()));
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
