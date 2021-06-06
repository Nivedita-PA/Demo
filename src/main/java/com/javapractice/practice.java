package com.javapractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class practice {
    static int i,j;
    public static void main(String[] args) {
//        for(i=1;i<=6;i++){
//            for(j=1;j<=6;j--){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i =1; i < 5; i++){
        list.add(i);
    }
    for(int i:list){
        System.out.println(i);//External for loop fetching values out of the arraylist
    }
        Consumer<Integer> action = i -> {
            System.out.println("printing arraylist: " +i);
        };
        list.forEach(action);

        Function<Integer,Double> todouble = i -> i.doubleValue();//Integer::doubleValue;

        list.forEach(i -> System.out.println("print " +todouble.apply(i)));

        Predicate<Integer> pred = i -> i > 0 && i % 2 == 0;
        list.forEach(i -> System.out.println("print even: " +pred.test(i)));

       list.forEach(i -> System.out.println(i));
    }
}
