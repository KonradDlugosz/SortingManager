package com.sparta.model.sorting;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory {

    public static List <Integer> list;
    public static List listFactory(Integer [] arr, int selected) {

        if(selected == 1){
            list = new ArrayList<>(List.of(arr));
        } else if(selected == 2){
            list = new LinkedList<>(List.of(arr));
        }

        return list;
    }

}
