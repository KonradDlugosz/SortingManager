package com.sparta.model;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {

    private static int length;
    private List<T> data = new ArrayList<>();

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        CustomList.length = length;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void addData(T element){
        data.add(element);
    }

}
