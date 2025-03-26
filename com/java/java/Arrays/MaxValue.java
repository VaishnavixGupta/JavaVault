package com.java.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr={11,5,18,2,1};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,1));
    }
//work on edge cases here, like array being null
    static int maxRange(int[] arr,int start,int end){

        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }

        int maxVal=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

  /*  // suppose the array is not empty
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal; */
    }
