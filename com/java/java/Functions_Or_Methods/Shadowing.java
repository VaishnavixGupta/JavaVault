package com.java.Functions_Or_Methods;

public class Shadowing {
    static int x=6;
    public static void main(String[] args) {
        System.out.println(x);  //6
        int x;                        //the class variable at line 4 is shadowed by this
//        System.out.println(x);      //scope will begin after value is initialised
        x=69;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);  //6
    }
}
