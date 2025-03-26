package com.java.Programs;
import java.util.Scanner;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
/*        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        swapNumbers(a,b);*/
//        int[] arr={12,44,87,4,60};
//        swappingArray(arr);
//        System.out.println(Arrays.toString(arr));
        String naam="Vihaan";
        swappingString(naam);
        System.out.println(naam);

    }

   /*     static void swapNumbers(int a,int b){
            int temp = a;
            a=b;
            b=temp;
            System.out.println(a+" "+b);
    }*/

//        static void swappingArray(int[] nums){
//           nums[2]=69;                                               //Here,arr and num point to the same object
//        }

        static void swappingString(String name){
            name="Hiten";                                            //Here,name and naam points to two different objects
        }

}
