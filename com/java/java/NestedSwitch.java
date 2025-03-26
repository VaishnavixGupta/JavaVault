package com.java;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Dept = in.next();
/*        switch(empID){
            case 1:{
                System.out.println("Vihaan");
                break;
            }
            case 2:{
                System.out.println("Kunal");
                break;
            }
            case 3:{
                System.out.println("Talwiinder");
                switch (Dept) {
                    case "IT": {
                        System.out.println("IT Department");
                        break;
                    }
                    case "Management": {
                        System.out.println("Management Department");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Dept");
                    }
                }

                }
                break;
            default:{
                System.out.println("Invalid EmpID");
            }
        }*/
        switch (empID) {
            case 1 -> System.out.println("Vihaan");
            case 2 -> System.out.println("Kunal");
            case 3 -> {
                System.out.println("Talwiinder");
                switch (Dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Dept");
                }
            }
            default -> System.out.println("Invalid ID");
        }
    }
}
