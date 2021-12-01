package com.sparta.model.test;

import com.sparta.model.factory.SortingFactory;
import com.sparta.model.sorting.BubbleSortImpl;
import com.sparta.model.sorting.BubbleSortRecursionImpl;
import com.sparta.model.sorting.QuickSortImpl;
import com.sparta.model.sorting.Sorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingFactoryTest {

    private static Sorter sorter;

    @Test
    @DisplayName("1. Given one, Return instance of BubbleSort")
    public void givenNumberReturnBubbleInstance() {
        sorter = SortingFactory.sortingFactory(1);
        assertTrue(sorter instanceof BubbleSortImpl);

    }

    @Test
    @DisplayName("2. Given two, Return instance of BubbleSort(recursive)")
    public void givenNumberReturnBubbleRecursiveInstance() {
        sorter = SortingFactory.sortingFactory(2);
        assertTrue(sorter instanceof BubbleSortRecursionImpl);

    }

    @Test
    @DisplayName("3. Given three, Return instance of QuickSort")
    public void givenNumberReturnQuickSortInstance() {
        sorter = SortingFactory.sortingFactory(3);
        assertTrue(sorter instanceof QuickSortImpl);

    }



}
