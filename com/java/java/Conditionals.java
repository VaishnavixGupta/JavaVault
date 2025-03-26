package com.java;

public class Conditionals {
    public static void main(String[] args) {
        /*if(boolean expression T or F){
            //body
        }
        else{
            //do this
        }*/

        /*   int salary=25000;
        if(salary>10000){
            salary+=2000;
        } else {
            salary = 1000;
        }
        System.out.println(salary);*/

        //Multiple if-else statement
        int salary=20000;
        if(salary<8000){
            salary+=3000;
        }
        else if (salary<10000){
            salary+=2000;
        }
        else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}
