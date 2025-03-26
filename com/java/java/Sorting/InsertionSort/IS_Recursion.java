package com.java.Sorting.InsertionSort;

import java.util.Arrays;

public class IS_Recursion {
    public static void main(String[] args) {
        int[] arr={88,2,44,15,44};
        is_recursion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void is_recursion(int[] arr,int size){
        if (size<=1){
        return;
        }
        is_recursion(arr,size-1);
        int last = arr[size-1];
        int j = size-2;
        while(j>=0 && arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
