package com.java.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,4,73,69,60,224};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Two pointer Method
    static void reverseArray(int[] arr){
       int start=0;
       int end=arr.length-1;

       while(start<end){
           //swap
           swap(arr,start,end);
           start++;
           end--;
       }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
