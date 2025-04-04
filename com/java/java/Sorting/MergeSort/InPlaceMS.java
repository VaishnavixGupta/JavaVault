package com.java.Sorting.MergeSort;

import java.util.Arrays;

public class InPlaceMS  {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        inPlaceMS(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void inPlaceMS(int[] arr,int start, int end){
        if(end-start ==1){
           return;
        }
        int mid=(start+end)/2;
        inPlaceMS(arr,start,mid);
        inPlaceMS(arr,mid,end);
        mergeInPlace(arr,start,mid,end);
    }
    static void mergeInPlace(int[] arr, int start,int mid,int end) {
        int[] mix = new int[end-start];

        int i=start,j=mid,k=0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not complete
        //copy the remaining elements
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<mid){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
