package com.java.Functions_Or_Methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
 //      Area();
/*        int ReturnType= Area();
        System.out.println(ReturnType);*/
//        int AreaOfRect=Area(4,5);
//        System.out.println(AreaOfRect);
        Scanner sc=new Scanner(System.in);
        String naam=sc.next();
        String personalised=myGreet(naam);
        System.out.println(personalised);
    }

    //Syntax for Methods :
/*
        <access modifier> <return type> <name>(arguments){
            //body
            return statement;
    }*/

 /*
        static void Area(){
        Scanner in=new Scanner(System.in);
        int l,w,AreaOfRect;
        System.out.print("Enter length: ");
        l = in.nextInt();
        System.out.print("Enter width: ");
        w = in.nextInt();
        AreaOfRect=l*w;
        System.out.println("Area of rectangle is: "+AreaOfRect);
    }*/

// Using return_type :
/*    static int Area(){
        Scanner in=new Scanner(System.in);
        int l,w,AreaOfRect;
        System.out.print("Enter length: ");
        l = in.nextInt();
        System.out.print("Enter width: ");
        w = in.nextInt();
        AreaOfRect=l*w;
        return AreaOfRect;
       // System.out.println("This statement is invalid: ");
    }*/

//Pass the value of numbers while calling method in "main" :
    //with arguments

 /*   static int Area(int l,int w){
        int Area=l*w;
        return Area;
    }*/
    static String myGreet(String name){
        return "Hey! "+name;
    }
}
