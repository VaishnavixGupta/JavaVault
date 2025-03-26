package com.java.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax:
//        ArrayList<datatype/wrapperClass> name=new ArrayList<datatype/WrapperClass>();
/*
        ArrayList<Integer> list = new ArrayList<Integer>();
*/
/*        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));
        list.set(0, 69);
        list.remove(2);
        System.out.println(list);*//*


        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.print(list);
*/


        //Multi-Dimensional ArrayList

        //Syntax:
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
