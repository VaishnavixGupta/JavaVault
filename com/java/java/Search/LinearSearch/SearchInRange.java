package com.java.Search.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linearSearch(nums,target,1,4));
        //Search for 3 int the range of index [1,4]

    }
    static boolean linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return true;           //return element; if instead of index need the element
            }
        }
        //this line will execute if none of the return statements above execute
        //hence,target is not found
        return false;          //return Integer.MAX_VALUE ;if -1 is an element how'll we know it's present or not
    }
}
