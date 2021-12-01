package com.sparta.model.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimSortImpl <T extends Comparable <? super T>> implements Sorter<T>{

    @Override
    public void sortingAlgorithm(T[] arr) {
        Arrays.sort(arr);
    }

    @Override
    public void sortingAlgorithm(List<T> arr) {
        Collections.sort(arr);
    }
}
