package com.java.Sorting.QuickSort;

import java.util.Arrays;

public class QuickSort {

    //Pivot: choose any element -> on first pass all the elements less than pivot will be on L.H.S of pivot -> greater elements on R.H.S
    //Time Complexity :
    //                   Best: O(N*logN)
    //                   Worst: O(N^2)     //n is size of array

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] nums,int low,int high){
        if(low >= high) {
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            //also a reason why if array is already sorted it will not swap
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if (start<=end) {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        //now my pivot is at correct index, sort two halves now
        quickSort(nums,low,end);
        quickSort(nums,start,high);
    }
}