package com.Goltsov.Fundamental_Programming;

/*
What happens when you cast a double to an int that is larger than the
largest possible int value? Try it out.
 */
public class task5 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println((int) Double.MAX_VALUE);
        // число double сократилось до максимального заначения int
    }
}
