package com.java;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        /*
            syntax of for loops:

            for(initialisation;condition;increment/decrement){
                //body
            }
        */
          //Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }
        //Q: Print numbers from 1 to n
//        int n = in.nextInt();
//        for(int num = 1; num <= n; num+=1){
//            System.out.println(num);
//        }

      /*
            syntax for while loops:

            while(condition){
               // body
            }

      */
        //Q: Print numbers from 1 to n
//        int num=1;
//        int n= in.nextInt();
//        while(num<=n){
//            System.out.println(num);
//            num+=1;
//        }

        /*
            Syntax for do-while loops:

            do{
            //body
            }
            while{condition}

        */
        int num=1;
        int n=in.nextInt();
        do{
            System.out.println(num);
            num+=1;
        }
        while(num<=n);

    }
}
