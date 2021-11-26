package com.sparta.sortingAlgorithm;

public class BubbleSortRecursionImpl implements Sorter{

    @Override
    public void sortingAlgorithm(int[] arr) {
        sortingAlgorithmRecursion(arr, arr.length);
    }

    public void sortingAlgorithmRecursion(int[] arr, int length) {
        if(length < 1) {
            return;
        } else if (length == 1) {
            return;
        }

        for(int i = 0; i < length - 1;i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sortingAlgorithmRecursion(arr, length - 1);
    }

}
