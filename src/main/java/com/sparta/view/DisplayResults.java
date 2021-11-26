package com.sparta.view;

import com.sparta.model.Sorter;

import java.util.Arrays;

import static com.sparta.SortingDriver.arrayGenerator;

public class DisplayResults {

    private static long startTime;
    private static long endTime;
    private static long timeTaken;

    private static int [] arr;


    public static void displaySortingResult(Sorter sorter, String method){
        if(method.equals("BubbleSort")){
            System.out.println("Bubble Sort (Nested For Loop):");
        } else if(method.equals("BubbleSortRecursive")){
            System.out.println("Bubble Sort (Recursive):");
        }else if(method.equals("QuickSort")){
            System.out.println("Quick Sort: ");
        }

        arr = arrayGenerator.generateArray();
        startTime = System.currentTimeMillis();
        sorter.sortingAlgorithm(arr);
        System.out.println(Arrays.toString(arr));

        endTime = System.currentTimeMillis();
        timeTaken = endTime- startTime;
        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println();

    }
}
