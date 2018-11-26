package com.anthem.made.java;

import java.util.Scanner;

/**
 * Created by AF11126 on 8/31/2018.
 */
public class ScannerClass {
    public static void main(String args[]) {

        int num; //Read a number
        Scanner input = new Scanner(System.in);
        System.out.println("Scanner used here..Enter a number to check its Even or Odd");
        num = input.nextInt(); // Conditional operator
        System.out.println((num%2)==0 ? "even number":"odd number");

    }
}
