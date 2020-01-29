package com.chhitijbhattachan.tutorials.java.api.java_util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {

    private static List<String> listOfNames = new ArrayList<String>();
    private static Vector vector = new Vector();
    public static void main(String... args) {

        Enumeration a = vector.elements();
        a.nextElement();
       
        Arrays.binarySearch(a, key);
        displayPropertyValues();
        // add value to the list
        listOfNames.add("chhitij");
        listOfNames.add("chhitij");
        displayPropertyValues();
        // find elements in the list
        System.out.println(listOfNames.contains("chhitij"));
        System.out.println(listOfNames.indexOf("chhitij"));
        
    }

    /**
     * display properties of arraylist
     */
    public static void displayPropertyValues(){
        try{
            System.out.printf("the size of the list is : %d%n", listOfNames.size());
            System.out.printf("the element on index %d is : %s%n", 0, listOfNames.get(0));
        } catch (Throwable ex){
            System.out.println(ex instanceof RuntimeException);
        }
    }

}