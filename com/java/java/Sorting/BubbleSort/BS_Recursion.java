package com.java.Sorting.BubbleSort;
import java.util.*;

public class BS_Recursion {
    public static void main(String[] args) {
        int[] arr={88,2,44,15,44};
        bs_recursion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
static void bs_recursion(int[] arr,int size){
    if(size==1){
        return;
    }
    for(int i=1;i<size;i++){
        if(arr[i]<arr[i-1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;

        }
        bs_recursion(arr,size-1);
    }
}
}