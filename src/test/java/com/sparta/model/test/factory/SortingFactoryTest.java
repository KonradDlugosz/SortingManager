package com.sparta.model.test.factory;

import com.sparta.model.factory.SortingFactory;
import com.sparta.model.sorting.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

    @Test
    @DisplayName("4. Given four, Return instance of TimSort")
    public void givenNumberReturnTimSortInstance() {
        sorter = SortingFactory.sortingFactory(4);
        assertTrue(sorter instanceof TimSortImpl);

    }

    @Test
    @DisplayName("5. Given five, Return instance of TreeSort")
    public void givenNumberReturnTreeSortInstance() {
        sorter = SortingFactory.sortingFactory(5);
        assertTrue(sorter instanceof TreeSortImpl);

    }



}
