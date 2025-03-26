package com.java.Programs;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        System.out.println("Enter a number: ");
        int num = in.nextInt();
        boolean ans=isArmstrong(num);
        System.out.println(ans);*/
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    //3-digit Armstrong Numbers
    static boolean isArmstrong(int num){
        int original = num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+(rem*rem*rem);
        }
        return sum==original;
    }

    }
