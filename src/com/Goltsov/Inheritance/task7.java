package com.Goltsov.Inheritance;
/*
Define an enumeration type for the eight combinations of primary colors
BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
and getBlue.

 */
public class task7 {
    public static void main(String[] args) {

    }
    enum Colors {
        BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

        Colors getRed() {
            return RED;
        }

        Colors getGreen() {
            return GREEN;
        }

        Colors getBlue() {
            return BLUE;
        }
    }
}
