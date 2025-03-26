package com.java.Search.LinearSearch;
import java.util.Scanner;

    public class LinearSearch {
        public static void main(String[] args) {
            int[] nums = {15, 82, 46, -42, 10, 63, -3, 11};
            int target = 10;
            int ans = linearSearch(nums, target);
            System.out.println(ans);
            //Time Complexity :
            //                   Best: O(1)
            //                   Worst: O(N)     //n is size of array

        }

        //search in the array: return the index if item found
        //if no value found return -1
        static int linearSearch(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {
                //check for element at every index if it is = target
                int element = arr[index];
                if (element == target) {
                    return index;           //return element; if instead of index need the element
                }
            }
            //this line will execute if none of the return statements above execute
            //hence,target is not found
            return -1;          //return Integer.MAX_VALUE ;if -1 is an element how'll we know it's present or not
        }
    }
