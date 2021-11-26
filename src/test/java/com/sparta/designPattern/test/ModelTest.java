package com.sparta.designPattern.test;

import com.sparta.designPattern.Model;
import com.sparta.sortingAlgorithm.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModelTest {

    private static Sorter sorter;

    @Test
    @DisplayName("1. Given one, Return instance of BubbleSort")
    public void givenNumberReturnBubbleInstance() {
        sorter = Model.sortingFactory(1);
        assertTrue(sorter instanceof BubbleSortImpl);

    }

    @Test
    @DisplayName("2. Given two, Return instance of BubbleSort(recursive)")
    public void givenNumberReturnBubbleRecursiveInstance() {
        sorter = Model.sortingFactory(2);
        assertTrue(sorter instanceof BubbleSortRecursionImpl);

    }

    @Test
    @DisplayName("3. Given three, Return instance of QuickSort")
    public void givenNumberReturnQuickSortInstance() {
        sorter = Model.sortingFactory(3);
        assertTrue(sorter instanceof QuickSortImpl);

    }



}
