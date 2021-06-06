package com.javapractice;

@FunctionalInterface
interface Mathfunction {
    int cal(int i, int j);
    static void print(Mathfunction func, int i, int j, String function) {
        System.out.println(function +" " +func.cal(i, j));
    }
}
public class MathComp {
//    public static int add(int a, int b){
//        return Math.addExact(a,b);
//    }
    public static void main(String[] args) {
        Mathfunction add = (i, j) -> i + j;
        Mathfunction divide = (i, j) -> i / j;
        Mathfunction multiply = (i, j) -> i * j;
        Mathfunction sub = (i, j) -> i - j;

        System.out.println("addition " + add.cal(4, 6));
        System.out.println("subtraction " + sub.cal(5, 8));
        System.out.println("divide " + divide.cal(4, 7));
        System.out.println("multiply " + multiply.cal(10, 11));

        Mathfunction.print(add, 47,88, "addition");
        Mathfunction.print(divide,88,20, "Division");
        Mathfunction.print(multiply,55,10,"multiplication");
        Mathfunction.print(sub,88,44,"subtraction");

    }
}
