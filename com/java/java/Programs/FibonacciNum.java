package com.java.Programs;
import java.util.Scanner;
public class FibonacciNum {
    public static void main(String[] args) {
        //Q: Find the value of n(th) fibonacci number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int p=0;
        int i=1;
        int count=2;
        while(count<=num)
        {
            int temp=i;
            i=i+p;
            p=temp;
            count+=1;
        }
        System.out.println(i);
    }
}
