package com.sparta.model.sorting;

import java.util.List;

public class BubbleSortRecursionImpl<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     *      Array
     */
    @Override
    public void sortingAlgorithm(T[] arr) {
        sortingAlgorithmRecursion(arr, arr.length);
    }

    public void sortingAlgorithmRecursion(T[] arr, int length) {
        if(length < 1) {
            return;
        } else if (length == 1) {
            return;
        }

        for(int i = 0; i < length - 1;i++){
            if(arr[i].compareTo(arr[i + 1]) > 0){
                T temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sortingAlgorithmRecursion(arr, length - 1);
    }

    /**
     *      List
     */

    @Override
    public void sortingAlgorithm(List<T> list) {
        sortingAlgorithmRecursion(list, list.size());
    }

    public void sortingAlgorithmRecursion(List<T> list, int length) {
        if(length < 1) {
            return;
        } else if (length == 1) {
            return;
        }

        for(int i = 0; i < length - 1;i++){
            if(list.get(i).compareTo(list.get(i + 1)) > 0){
                T temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
        sortingAlgorithmRecursion(list, length - 1);
    }

}
