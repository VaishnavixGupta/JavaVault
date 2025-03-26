package com.java.Programs;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean ans= isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        if(c*c>num){
            return true;
        }
        return false;
    }
}