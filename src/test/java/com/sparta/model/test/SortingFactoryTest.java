package com.sparta.model.test;

import com.sparta.model.array.SortingFactory;
import com.sparta.model.array.BubbleSortImpl;
import com.sparta.model.array.BubbleSortRecursionImpl;
import com.sparta.model.array.QuickSortImpl;
import com.sparta.model.array.SorterArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingFactoryTest {

    private static SorterArray sorterArray;

    @Test
    @DisplayName("1. Given one, Return instance of BubbleSort")
    public void givenNumberReturnBubbleInstance() {
        sorterArray = SortingFactory.sortingFactory(1);
        assertTrue(sorterArray instanceof BubbleSortImpl);

    }

    @Test
    @DisplayName("2. Given two, Return instance of BubbleSort(recursive)")
    public void givenNumberReturnBubbleRecursiveInstance() {
        sorterArray = SortingFactory.sortingFactory(2);
        assertTrue(sorterArray instanceof BubbleSortRecursionImpl);

    }

    @Test
    @DisplayName("3. Given three, Return instance of QuickSort")
    public void givenNumberReturnQuickSortInstance() {
        sorterArray = SortingFactory.sortingFactory(3);
        assertTrue(sorterArray instanceof QuickSortImpl);

    }



}
