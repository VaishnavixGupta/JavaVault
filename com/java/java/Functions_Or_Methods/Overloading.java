package com.java.Functions_Or_Methods;

public class Overloading {
    public static void main(String[] args) {
        over(6);
        over(3,5);
        over("vihaan");
//        over();   //Ambiguity
// at compile time it decides which function to run
    }
    static void over(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void over(int b,int c){
        System.out.println("Second one");
        System.out.println(b);
        System.out.println(c);
    }
    static void over(String name){
        System.out.println("Third one");
        System.out.println(name);
    }
    //either no. of arguments or data type of agruments should be different
}
