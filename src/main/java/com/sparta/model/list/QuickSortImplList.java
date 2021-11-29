package com.sparta.model.list;

import java.util.List;

public class QuickSortImplList implements SorterList{

    @Override
    public void sortingAlgorithm(List<Integer> list) {
        int endIndex = list.size() - 1;
        int starIndex = list.size() - endIndex - 1;

        quickSortProcess(list, starIndex, endIndex);

    }

    public void quickSortProcess(List<Integer> list, int startIndex, int endIndex) {

        if(startIndex < endIndex){
            int partitionIndex = partition(list, startIndex, endIndex);

            quickSortProcess(list, startIndex, partitionIndex - 1);
            quickSortProcess(list, partitionIndex + 1, endIndex);

        }
    }

    private int partition(List<Integer> list, int startIndex, int endIndex) {
        int pivot = list.get(endIndex);
        int i = startIndex - 1;

        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, endIndex);
        return i + 1;
    }

    private void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(i + 1));
        list.set(i + 1, temp);
    }
}
