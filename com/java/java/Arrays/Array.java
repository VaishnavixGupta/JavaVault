package com.java.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

    /*    syntax:
    datatype[] variable_name=new datatype[size];*/

  /*  int[] rollno=new int[5];
    int[] rollno2={12,54,4,23,11};
    //all the type of data in an array should be same*/

        Scanner in = new Scanner(System.in);
        int[] rnos; //declaration of array. ros is getting defined in stack
        rnos = new int[5]; //initialisation: actually here object is being created in the heap
        rnos[0]=4;
        rnos[1]=5;
        rnos[2]=6;
        rnos[3]=7;
        rnos[4]=8;
        System.out.println(rnos[0]);

        for(int i=0;i<rnos.length;i++){
           rnos[i]=in.nextInt();
        }
//        System.out.println(Arrays.toString(rnos));
        /*for(int i=0;i<rnos.length;i++){
            System.out.println(rnos[i]+" ");*/
        for(int i: rnos){       //for every element in array, print the element
            System.out.print(i+" ");      //here i represents element of the array
        }

    }
}
