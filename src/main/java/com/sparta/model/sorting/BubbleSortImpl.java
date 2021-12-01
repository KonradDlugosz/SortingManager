package com.sparta.model.sorting;

import java.util.List;

public class BubbleSortImpl<T extends Comparable <? super T>> implements Sorter<T> {

    @Override
    public void sortingAlgorithm(T[] arr) {
        if(arr.length < 1){
            return;
        }
        int arrLength = arr.length - 1;
        boolean isSorted;

        for(int i = 0; i < arrLength ;i++) {
            isSorted = false;
            for(int j = 0; j < arrLength - i;j++){
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(!isSorted){
                return;
            }
        }
    }

    @Override
    public void sortingAlgorithm(List<T> list) {
        T temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

}
