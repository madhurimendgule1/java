package com.anthem.made.java;

import java.util.Scanner;

/**
 * Created by AF11126 on 8/3/2018.
 */
public class MadeAccessSpecifier {
    public String pub = "I am public variable";
    protected String prot = "I am protected variable";
    private String priv = "I am private variable";
    String deft = "I am default variable";

    public void method () {
        System.out.println(pub + prot + priv + deft);
    }

    public static void main(String args[]) {
        String m = "Madhuri";
        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        System.out.println(m.charAt(0));
        System.out.println(m);

        String revere ="";
        for (int i=m.length()-1; i>=0; i--) {
            //revere.concat((()m.charAt(i))) ;
            revere=revere+m.charAt(i);

        }
        System.out.println(revere);

    }
}
