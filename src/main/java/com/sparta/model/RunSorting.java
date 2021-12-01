package com.sparta.model;

import com.sparta.model.sorting.Sorter;
import com.sparta.view.DisplayFunctions;

import java.util.Arrays;
import java.util.List;

public class RunSorting <T extends Comparable <? super T>>{


    public void runSorting(Sorter sorter,T[] arr){
        long startTime = System.currentTimeMillis();
        sorter.sortingAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
        DisplayFunctions.displayTimeTaken(startTime);
    }

    public void runSorting(Sorter sorter, List<T> list){
        long startTime = System.currentTimeMillis();
        sorter.sortingAlgorithm(list);
        System.out.println(list);
        DisplayFunctions.displayTimeTaken(startTime);
    }
}
