package com.Goltsov.Interfaces_and_Lambda_Expressions;

import java.util.Arrays;
import java.util.NoSuchElementException;

/*
Implement a static of method of the IntSequence class that yields a sequence
with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
sequence with six values. Extra credit if you return an instance of an
anonymous inner class.
 */
public class task4 {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()){
            System.out.print(sequence.next());
        }
    }
}
interface IntSequence{

    static IntSequence of(int... values) {
        return new IntSequence() {

            final int[] arr = Arrays.copyOf(values, values.length);
            int index;

            @Override
            public int next() {
                if (index >= arr.length) {
                    throw new NoSuchElementException();
                } else {
                    return arr[index++];
                }
            }

            @Override
            public boolean hasNext() {
                return index < arr.length;
            }
        };
    }
    static IntSequence constant(int i) {
        return new IntSequence() {
            final int value = i;

            @Override
            public int next() {
                return value;
            }

            @Override
            public boolean hasNext() {
                return true;
            }

        };
    }

    boolean hasNext();
    int next();
}
