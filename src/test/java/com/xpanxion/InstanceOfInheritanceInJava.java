package com.xpanxion;

import java.util.Scanner;

/**
 * Created by AF11126 on 8/3/2018.
 */
class A {}
class B extends A{}
class C extends B{}
class D extends C{}

public class InstanceOfInheritanceInJava {



    public static void main(String args[]) {

    B b= new C();
        //C c = new B();
        if(b instanceof A) {
            System.out.println("instance of A");
        }
        if(b instanceof B) {
            System.out.println("instance of B");
        }
        if(b instanceof C) {
            System.out.println("instance of C");
        }
        if(b instanceof D) {
            System.out.println("instance of D");
        }


    }

}
