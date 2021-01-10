package com.Goltsov.Fundamental_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

/*
Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all
rows, all columns, and the diagonals is the same). Accept lines of input
that you break up into individual integers, and stop when the user enters
a blank line. For example, with the input

16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1
(Blank line)
your program should respond affirmatively.
 */
public class task14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int length;
        ArrayList<Integer> list;
        if (!str.isEmpty()) {
            String[] strings = str.split(" ");
            list = new ArrayList<>();
            length = strings.length;
            while (!str.isEmpty()) {
                for (String s : strings) {
                    list.add(Integer.parseInt(s));
                }
                str = reader.readLine();
                strings = str.split(" ");
            }
        } else {
            throw new IllegalArgumentException("Введён пустой набор значений");
        }
        if (length * length != list.size()) {
            throw new IllegalArgumentException("Колличество строк должно совпадать с количеством столбцов");
        }
        int[][] matrix = fillMatrix(length, list);


        System.out.println("isMagicSquare? " + isMagicSquare(matrix));
    }

    private static int[][] fillMatrix(int length, ArrayList<Integer> list) {
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = list.get(i * length + j);
            }
        }
        return matrix;
    }

    private static boolean isMagicSquare(int[][] square) {
        int row = 0;
        HashSet<Integer> check = new HashSet<>();
        int column = 0;
        int d1 = 0;
        int d2 = 0;

        for (int[] arr : square) {
            for (int j : arr) {
                row += j;
            }
            check.add(row);
            row = 0;
        }
        if (check.size() > 1) {
            return false;
        }
        for (int i = 0; i < square.length; i++) {
            for (int[] ints : square) {
                column += ints[i];
            }
            check.add(column);
            column = 0;
        }
        if (check.size() > 1) {
            return false;
        }

        //diagonal
        for (int i = 0; i < square.length; i++) {
            d1 += square[i][i];
            d2 += square[i][square.length - 1 - i];
        }
        check.add(d1);
        check.add(d2);

        return check.size() <= 1;
    }
}
