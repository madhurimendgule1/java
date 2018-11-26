package com.anthem.made.java;

import com.xpanxion.XpMainClassTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by AF11126 on 8/3/2018.
 */
//public class MadeMainClassTestAccessSpecifier {
public class MadeMainClassTestAccessSpecifier extends MadeAccessSpecifier{

    XpMainClassTest xpMainClassTest = new XpMainClassTest();
    MadeAccessSpecifier accessSpecifier = new MadeAccessSpecifier();
//    MadeMainClassTestAccessSpecifier madeMainClassTest1 = new MadeMainClassTestAccessSpecifier();

    public void getXpMainClassTest() {
        String s = xpMainClassTest.pub;
        xpMainClassTest.method();
        //System.out.println(xpMainClassTest.);
        System.out.println(accessSpecifier);
        //madeMainClassTest1.


        //Access variable
        System.out.println(pub);
        System.out.println(prot);
        System.out.println(deft);
    }

    public static void main(String args[]) {

        MadeMainClassTestAccessSpecifier madeMainClassTest = new MadeMainClassTestAccessSpecifier();
        //System.out.println(madeMainClassTest.prot);
        //System.out.println(madeMainClassTest.pub);



    }
}
