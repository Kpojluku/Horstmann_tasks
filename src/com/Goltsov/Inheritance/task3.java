package com.Goltsov.Inheritance;
/*
Make the instance variables x and y of the Point class in Exercise 1 protected.
Show that the LabeledPoint class can access these variables only in LabeledPoint
instances.
 */
public class task3 {
    public static void main(String[] args) {
       double x = new LabeledPoint("d",2,3).x;
    }
}
