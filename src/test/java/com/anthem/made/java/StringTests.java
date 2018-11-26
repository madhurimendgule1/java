package com.anthem.made.java;

import com.anthem.made.java.MadeCloneClass;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by AF11126 on 8/3/2018.
 */
public class StringTests implements Cloneable, Serializable {

    private static class MyClass {

    }
    public static void main(String args[]) {

        printLengthyString();

        //print array numbers count
        //arrayNumbersCount();





        MadeCloneClass cloneObject = new MadeCloneClass();
        Object obj = new Object();


        //quick wasy to reverse String in Java - Use StringBuffer
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s ,                 reversed String %s  %n", word, reverse);

                //another quick to reverse String in Java - use StringBuilder
                word = "WakeUp";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s ,                 reversed String %s %n", word, reverse);

                // one way to reverse String without using
                // StringBuffer or StringBuilder is writing
                // own utility method
                word = "Band";
        reverse = reverse(word);
        System.out.printf(" original String : %s ,                 reversed String %s %n", word, reverse);






    }


    public static String reverse(String source){
        if(source == null || source==""){
            return source;
        }
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }

    public static void arrayNumbersCount(){
        //print array numbers count
        int arr[] = {10,12,12,15,87,87,56,45};
        for(int j=0; j<=arr.length; j++) {
            int temp=arr[j];
            int count=0;
            for(int k=0; k<=arr.length-1; k++) {
                if (temp == arr[k]) {
                    count= count+1;
                }

            }
            System.out.println("temp"+ temp +"count"+ count);
        }
    }

    public static void printLengthyString(){
        //print string having maxixmum lenght

        String str[] = {"abcd", "ammmmmmmmmmmmmmmmmmmmmmmmmmmmmm", "aa", "abcddfddddddddd", "bcddddd"};

        String tempMax = str[0];
        for(int j=1; j<=str.length-1; j++) {
            if (tempMax.length() > str[j].length()) {
               // break;
            } else {
                tempMax = str[j];
            }
        }
        System.out.println("Max lengh string is :"+ tempMax );

        Scanner scanner = new Scanner(System.in);

    }

}
