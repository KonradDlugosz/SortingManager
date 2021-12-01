package com.sparta.model.sorting;

import java.util.List;

public interface Sorter<T> {

    void sortingAlgorithm(T[] arr);
    void sortingAlgorithm(List<T> arr);


}
