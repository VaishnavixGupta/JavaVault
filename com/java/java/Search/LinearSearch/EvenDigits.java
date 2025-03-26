package com.java.Search.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
    int[] nums={18,124,9,1764,98,1};
        System.out.println(findNumbers(nums));
        System.out.println(digits(22618));
    //Find no. of numbers that have even no. of digits
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contains even no. of digits
    //count no. of digits->convert 1764 to string and take length
    static boolean even(int num){
        int numberOfDigits=digits(num);
       /* if(numberOfDigits%2==0){
            return true;
            }
            return false;   */
            return numberOfDigits%2==0;
    }

    static int digits(int num){

        if(num<0){
            num=num*-1;     //converting negative number to positive
        }
        if(num==0){
            return 1;       //0 will count as 1 digit
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    /*static int digits2(int num){
     if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }*/
}
