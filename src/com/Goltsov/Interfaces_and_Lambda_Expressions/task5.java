package com.Goltsov.Interfaces_and_Lambda_Expressions;
/*
Add a static method with the name constant of the IntSequence class that
yields an infinite constant sequence. For example, IntSequence.constant(1)
yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
lambda expression.
 */
public class task5 {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.constant(1);
        while (sequence.hasNext()){
            System.out.print(sequence.next());
        }
    }
}
