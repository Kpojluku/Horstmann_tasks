package com.Goltsov.Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/*
Given an array of File objects, sort it so that directories come before files,
and within each group, elements are sorted by path name. Use a lambda
expression to specify the Comparator
 */
public class task13 {
    public static void main(String[] args) {
        File[] files = new File("src\\com\\Goltsov").listFiles();
        sort(files);
        System.out.println();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }

    }

    public static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }
}