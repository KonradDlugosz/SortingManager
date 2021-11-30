package com.sparta.model.list;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListFactory {

    public static List <Integer> list;
    public static List listFactory(int [] arr, int selected) {

        if(selected == 1){
            list = new ArrayList<>(List.of(convertIntToClass(arr)));
        } else if(selected == 2){
            list = new LinkedList<>(List.of(convertIntToClass(arr)));
        }

        return list;
    }


    private static Integer[] convertIntToClass(int [] arr){
        Integer[] classInt = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            classInt[i] = Integer.valueOf(arr[i]);
        }

        return classInt;
    }

}
