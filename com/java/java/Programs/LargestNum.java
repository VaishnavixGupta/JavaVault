package com.java.Programs;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        if(num4>max){
            max=num4;
        }
        System.out.println(max);
    }
}
