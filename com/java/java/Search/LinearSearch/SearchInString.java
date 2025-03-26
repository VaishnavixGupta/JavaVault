package com.java.Search.LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Vihaan";
        char target='V';
        System.out.print(search(name,target));
       // System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;

                /*for(char ch: str.toCharArray()){
                    if(ch==target){
                        return true;*/
            }
        }
        return false;
    }
}
