package com.sparta.model.list;

import java.util.List;

public class BubbleSortRecursiveImplList implements SorterList {

    @Override
    public void sortingAlgorithm(List<Integer> list) {
        sortingAlgorithmRecursion(list, list.size());
    }

    public void sortingAlgorithmRecursion(List<Integer> list, int length) {
        if(length < 1) {
            return;
        } else if (length == 1) {
            return;
        }

        for(int i = 0; i < length - 1;i++){
            if(list.get(i).compareTo(list.get(i + 1)) > 0){
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
        sortingAlgorithmRecursion(list, length - 1);
    }
}
