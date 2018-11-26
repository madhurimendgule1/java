package com.anthem.made.java;

import java.util.*;

/**
 * Created by AF11126 on 8/8/2018.
 */
public class MadeJavaMapsExample {

    //not Synchronised so fast as compared to hashtable
    //No ordering
    private HashMap<Integer, String> studentsHashMap = new HashMap<Integer, String>();

    //Synchronised so slow as compared to hashmap
    private Hashtable<Integer, String> studentsHashTable = new Hashtable<Integer, String>();

    //TreeMap is sorted on Key and non synchronised
    //sorted so less in performance
    private TreeMap<String, Integer> vehicles = new TreeMap();

    //LinkedHashMap is a compromise between hashmap and Treemap, it doesn't provide sorting but unlike HashMap, it provides ordering
    private LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

     private void treeMapExamples(){
         //String a= null; //allowded
         //int a= null; it is not allowded
        // Add some vehicles.

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
        vehicles.put("Maruti", 20);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for(String key: vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        System.out.println("Highest key: " + vehicles.lastKey());
        System.out.println("Lowest key: " + vehicles.firstKey());

        System.out.println("\nPrinting all values:");
        for(Integer val: vehicles.values())
            System.out.println(val);
        System.out.println();

        vehicles.remove("Audi");
        for(Integer val: vehicles.values())
            System.out.println(val);
        System.out.println();

        // Clear all values.
        vehicles.clear();

        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }

    private void addStudents() {
        studentsHashMap.put(1, "aaa");
        studentsHashMap.put(2, "bbb");
        studentsHashMap.put(3, "ccc");
        studentsHashMap.put(4, "dd");
        studentsHashMap.put(4, "replaceDD");
        studentsHashMap.put(null, "value for null key");
        studentsHashMap.put(null, "value for null key 2");
    }
    private void printStudentsHashMap() {
        System.out.println("Hashmap  values: "+ studentsHashMap);
    }

    private void printHashMapByEntrySet() {
        for(Map.Entry entry: studentsHashMap.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }

    private void getNullStudent() {
        System.out.println("Hashmaps: "+ studentsHashMap.get(null));
    }

    private void addStudentsInHashTable() {
        studentsHashTable.put(1, "aaa");
        studentsHashTable.put(2, "bbb");
        studentsHashTable.put(3, "ccc");
        studentsHashTable.put(4, "dd");
        studentsHashTable.put(4, "replaceDD");
        studentsHashTable.put(2, "replace 2");
        //below gives NullPoineterExecption as runtime
        //studentsHashTable.put(null, "value for null key");
        //studentsHashTable.put(null, "value for null key 2");

        System.out.println("HashTable: "+ studentsHashTable);
    }

    private void printHashTableByEntrySet() {

        for(Map.Entry entry: studentsHashTable.entrySet()) {
            System.out.println("Print By entrySet "+entry.getKey() +" "+ entry.getValue());
        }

        for (Integer key: studentsHashTable.keySet()) {
            System.out.println("Print By keySet "+key +" "+studentsHashTable.get(key));
        }

        for(String values : studentsHashTable.values()) {
            System.out.println("Print By values collections "+values);
        }
    }

    public static void main(String args[]) {
        MadeJavaMapsExample madeJavaMapsExample = new MadeJavaMapsExample();

        //HashMaps
        madeJavaMapsExample.addStudents();
        madeJavaMapsExample.printStudentsHashMap();
        madeJavaMapsExample.getNullStudent();
        madeJavaMapsExample.printHashMapByEntrySet();

        madeJavaMapsExample.addStudentsInHashTable();
        madeJavaMapsExample.printHashTableByEntrySet();

        madeJavaMapsExample.treeMapExamples();

    }

}
