package com.Goltsov.Interfaces_and_Lambda_Expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements
are in increasing order, as determined by the comparator
 */
public class task8 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("aaa");
        strings.add("aa");
        strings.add("a");
        strings.add("aaaaa");
        strings.add("aa");
        strings.add("aaa");
        System.out.println(strings);
        new task8().luckySort(strings, Comparator.comparing(String::length));
        System.out.println(strings);
    }
    void luckySort(ArrayList<String> strings, Comparator<String> comp){

        while (true){
            int count = 0;
            Collections.shuffle(strings);
            for(int i = 0; i<strings.size()-1;i++){
                if(comp.compare(strings.get(i), strings.get(i+1))<=0){
                    count++;
                }
            }
            if (count==strings.size()-1){
                return;
            }
        }
    }
}