package com.java.Programs;
import java.util.Scanner;
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Enter the occuring number : ");
        int n=in.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==n) {
                count += 1;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
