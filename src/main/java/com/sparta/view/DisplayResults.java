package com.sparta.view;

import com.sparta.model.Sorter;

import java.util.Arrays;

import static com.sparta.SortingDriver.arrayGenerator;

public class DisplayResults {


    public static void displaySortingResult(Sorter sorter, String method){
        switch (method) {
            case "BubbleSort" -> System.out.println("Bubble Sort (Nested For Loop):");
            case "BubbleSortRecursive" -> System.out.println("Bubble Sort (Recursive):");
            case "QuickSort" -> System.out.println("Quick Sort: ");
        }

        int[] arr = arrayGenerator.generateArray();
        long startTime = System.currentTimeMillis();
        sorter.sortingAlgorithm(arr);
        System.out.println(Arrays.toString(arr));

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println();

    }
}
