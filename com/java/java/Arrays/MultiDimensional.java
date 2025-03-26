package com.java.Arrays;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
       TwoD_Array();
    }
    static void TwoD_Array(){
        Scanner in = new Scanner(System.in);
//        int[][] arr=new int[3][2];        //not necessary to give number of columns
/*        int[][] arr2={{1,4,5},  //0th index
                {5,6,3},           //1st index
                {7,9,1}            //2nd index
        };*/
        int[][] arr2= new int[3][2];
        //input
        for(int row=0;row<arr2.length;row++){
            for(int column=0;column<arr2[row].length;column++){
                arr2[row][column]=in.nextInt();
            }
        }
        //output
        for(int row=0;row<arr2.length;row++){
                System.out.println(arr2[row]+" ");
            }
        }
    }
