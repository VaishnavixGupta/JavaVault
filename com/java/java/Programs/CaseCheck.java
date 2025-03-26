package com.java.Programs;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char Alphabet = in.next().trim().charAt(0);
        if (Alphabet >= 'a' && Alphabet <= 'z') {
            System.out.println("lowercase letter");
        }
        if (Alphabet >= 'A' && Alphabet <= 'Z') {
            System.out.println("uppercase letter");
        }
    }
}
