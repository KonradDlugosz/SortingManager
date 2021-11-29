package com.sparta.model.array;

public class BubbleSortImpl implements SorterArray {

    @Override
    public void sortingAlgorithm(int[] arr) {
        if(arr.length < 1){
            return;
        }
        int arrLength = arr.length - 1;
        boolean isSorted;

        for(int i = 0; i < arrLength ;i++) {
            isSorted = false;
            for(int j = 0; j < arrLength - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
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

}
