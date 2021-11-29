package com.sparta.model.array;

public class QuickSortImpl implements SorterArray {

    @Override
    public void sortingAlgorithm(int[] arr) {
        int endIndex = arr.length - 1;
        int starIndex = arr.length - endIndex -1;

        quickSortProcess(arr, starIndex, endIndex);

    }

    public void quickSortProcess(int[] arr, int startIndex, int endIndex) {

        if(startIndex < endIndex){
            int partitionIndex = partition(arr, startIndex, endIndex);

            quickSortProcess(arr, startIndex, partitionIndex - 1);
            quickSortProcess(arr, partitionIndex + 1, endIndex);

        }
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = startIndex - 1;

        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, endIndex);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
