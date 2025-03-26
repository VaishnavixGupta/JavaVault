package com.java;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit= in.next();
        int day = in.nextInt();
/*        switch(fruit){

            case "Mango":{
                System.out.println("Yellow in color");
                break;
            }
            case "Apple":{
                System.out.println("Red in color");
                break;
            }
            case "Orange":{
                System.out.println("Orange in color");
                break;
            }
            default:{
                System.out.println("Not a valid fruit");
            }
            }*/
// Enhanced Switch case
           /* switch(fruit){
                case "Mango" -> System.out.println("King of fruits");
                case "Apple" -> System.out.println("Apples are red in color");
                case "Orange" -> System.out.println("Round fruit");
                default -> System.out.println("Not a valid fruit");
            }*/

     /*   switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                System.out.println("Weekday");
                break;
            }
            case 6:
            case 7:{
                System.out.println("Weekend");
                break;
            }
            default:{
                System.out.println("Invalid day! Enter day between 1 and 7");
            }
        }*/
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
