package com.java.Functions_Or_Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,75,24,89);
        funs("Hey!","My","Name","is");
        multiple(6,9,"vihaan","is","sleepy");// stored internally as an array
    }
    static void fun(int ...v){          //taking arguments as array of integers
        System.out.println(Arrays.toString(v));
    }
    static void funs(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }
}

