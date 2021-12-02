package com.sparta.model.generator;

import com.sparta.model.factory.SortingFactory;
import com.sparta.model.sorting.Sorter;
import com.sparta.view.DisplayFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sparta.SortingDriver.arrayIntegerGenerator;
import static com.sparta.SortingDriver.arrayStringGenerator;

public class TimeReport {

    private static List<String> algorithmName = new ArrayList<>(List.of(
            "Bubble sort (Nested loop)",
            "Bubble Sort (Recursive)",
            "Quick Sort",
            "Tim Sort",
            "Tree Sort"));

    private static List<Long> timeTaken;

    public static void GenerateTimeReport() {

        Integer [] arrInteger = arrayIntegerGenerator.generateArray();
        String [] arrString = arrayStringGenerator.generateArray();
        List<Integer> listInteger = new ArrayList<>(List.of(arrayIntegerGenerator.generateArray()));
        List<String> listString = new ArrayList<>(List.of(arrayStringGenerator.generateArray()));




        System.out.print("Integer array to sort: ");
        System.out.println(Arrays.toString(arrInteger));

        // Array integers Report
        System.out.println();
        System.out.println("Array data structure:");
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(arrInteger);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }

        // List Integer Report
        System.out.println();
        System.out.println("Array list data structure:");
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(listInteger);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }


        System.out.print("String array to sort: ");
        System.out.println(Arrays.toString(arrString));

        // Array Strings Report
        System.out.println();
        System.out.println("Array data structure:");
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(arrString);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }


        // List String Report
        System.out.println();
        System.out.println("Array list data structure:");
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(listString);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }




    }
}
