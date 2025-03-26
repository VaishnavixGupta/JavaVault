package com.java.Search.BinarySearch;

/*
// let the array be sorted
//find the middle element
//if target element > mid element search in right
//if mid element==target elemet //answer
//k= no. of levels in worst case
*/
public class BinarySearch {
    //Time Complexity :
    //                   Best: O(1)
    //                   Worst: O(logN)     //n is size of array
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //int mid = (start + end) / 2;
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
