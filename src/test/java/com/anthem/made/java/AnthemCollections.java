package com.anthem.made.java;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by AF11126 on 7/27/2018.
 */
public class AnthemCollections {


    public static void main(String[] args) {
        method("Sss");

        //************Threading
        /*final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();*/


        //Collections Framework Examples....*

        List<String> exArrayList = new ArrayList<String>(5);

        //Reversing the ArrayList
        List<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Mango");
        stringArrayList.add("Banana");
        stringArrayList.add("Mango");
        //stringArrayList.add(null); Can have null as a value
        stringArrayList.add("Apple");
        //stringArrayList.add(null);
        System.out.println("Before Reversing");
        System.out.println(stringArrayList.toString());

        //Iterator
        /*while(stringArrayList.iterator().hasNext()) {

        }*/

        Collections.reverse(stringArrayList);
        System.out.println("After Reversing");
        System.out.println(stringArrayList);

        //Reversing the LinkedList
        List<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("Mango");
        stringLinkedList.add("Banana");
        stringLinkedList.add("Chicccooo");
        stringLinkedList.add("Apple");
        System.out.println("Before Reversing linked list");
        System.out.println(stringLinkedList.toString());
        Collections.reverse(stringLinkedList);

        Collections.reverse(stringArrayList);
        System.out.println("After Reversing linked list");
        System.out.println(stringLinkedList);

        System.out.println("Minimun: "+Collections.min(stringLinkedList));
        System.out.println("Max: "+Collections.max(stringLinkedList));
        Collections.synchronizedList(stringArrayList);

        System.out.println("Sort: ");
        Collections.sort(stringLinkedList);
        System.out.println("After sort"+ stringLinkedList);

        Set<String> linkedHashSet = new LinkedHashSet<String>(stringArrayList);
        Set<String> hashSet = new HashSet<String>(stringArrayList);
        Set<String> treeSet = new TreeSet<String>(stringArrayList);

        linkedHashSet.add(null);
        System.out.println("linkedHashSet: ");
        System.out.println(linkedHashSet);


        //null allowded
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet: ");
        System.out.println(hashSet);

        //treeSet.add(null); null values are not allowded in  treeset
        System.out.println("treeSet: ");
        System.out.println(treeSet);

        //Set<String> sNew = new

        List<String> vector = new Vector<String>();
        vector.add("M");

        //List with different dataset. Size of the list grows
        List<ScannerClass> scannerClass = new ArrayList<ScannerClass>(2);
        scannerClass.add(null);
        scannerClass.add(null);
        scannerClass.add(null);
        scannerClass.add(new ScannerClass());

        System.out.println("Scanner class list is "+scannerClass);

        Iterator<ScannerClass> listIterator = scannerClass.iterator();
        Iterator<ScannerClass> listIterator2 = scannerClass.listIterator();
        ListIterator<ScannerClass> listIterator1 =scannerClass.listIterator();

        if(listIterator.hasNext())
            System.out.println(listIterator.next());

        //List<int> premitiveIntList = new ArrayList<int>(); this is not possible. we cannot create/save list of premitive data types
        List<Integer> intList = new ArrayList<Integer>();

    }

    public static void method(Object o) {
        final  int i;
        i=3;
        System.out.println("Object impl");
    }
    public static void method(String s) {
        System.out.println("String impl");
    }
    public static void method(StringBuffer i){
        System.out.println("StringBuffer impl");
    }
}
