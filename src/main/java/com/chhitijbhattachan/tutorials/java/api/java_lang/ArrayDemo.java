package com.chhitijbhattachan.tutorials.java.api.java_lang;
import java.util.Arrays;

public class ArrayDemo{
    public static void main(String... args){
        System.arraycopy(new int[]{1,2,3}, 1, new int[2], 0, 2); // copy using System class
        // copy using Arrays class
        // sort
        // parallel sort
        // sequential sort
        // compare if two arrays are equal
        Arrays.equals(a, a2)
        // binary search
        // fill
        copyArray();
    }

    public static void copyArray(){
        int[] copyFrom = {1, 2, 3, 4, 5};
        int[] newInt = Arrays.copyOf(copyFrom, 3);
        for(int i : newInt){
            System.out.println(i);
        }
    }

    public static void copyRangeOfArray(){
        
    }
}