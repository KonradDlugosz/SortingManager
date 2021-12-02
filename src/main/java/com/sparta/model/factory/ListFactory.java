package com.sparta.model.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory<T extends Comparable<? super T>> {

    public  List <T> list;
    public List listFactory(T [] arr, int selected) {

        if(selected == 1){
            list = new ArrayList<>(List.of(arr));
        } else if(selected == 2){
            list = new LinkedList<>(List.of(arr));
        }

        return list;
    }

}
