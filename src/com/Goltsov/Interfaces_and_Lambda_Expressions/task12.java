package com.Goltsov.Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.util.Arrays;
/*
Using the list(FilenameFilter) method of the java.io.File class, write a method
that returns all files in a given directory with a given extension. Use a
lambda expression, not a FilenameFilter. Which variable from the enclosing
scope does it capture?
 */
public class task12 {
    public static void main(String[] args) {
        String[] files = withExtension("src\\com\\Goltsov", ".txt");
        System.out.println(Arrays.toString(files));
    }
    public static String[] withExtension(String path, String extension) {
        return new File(path).list((dir, name) -> name.endsWith(extension));
    }
}
