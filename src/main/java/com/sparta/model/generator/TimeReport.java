package com.sparta.model.generator;

import com.sparta.model.factory.SortingFactory;
import com.sparta.model.sorting.Sorter;
import com.sparta.view.DisplayFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.sparta.SortingDriver.arrayIntegerGenerator;
import static com.sparta.SortingDriver.arrayStringGenerator;

public class TimeReport <T> {

    private static List<String> algorithmName = new ArrayList<>(List.of(
            "Bubble sort (Nested loop)",
            "Bubble Sort (Recursive)",
            "Quick Sort",
            "Tim Sort",
            "Tree Sort"));

    public static void GenerateTimeReport() {

        Integer [] arrInteger = arrayIntegerGenerator.generateArray();
        String [] arrString = arrayStringGenerator.generateArray();
        List<Integer> listInteger = new ArrayList<>(List.of(arrayIntegerGenerator.generateArray()));
        List<String> listString = new ArrayList<>(List.of(arrayStringGenerator.generateArray()));

        TimeReport<Integer> integerTimeReport= new TimeReport<>();
        TimeReport<String> stringTimeReport = new TimeReport<>();


        System.out.print("Integer array to sort: ");
        System.out.println(Arrays.toString(arrInteger));


        // Array integers Report
        System.out.println();
        System.out.println("| Array data structure | ");
        printLine();
        integerTimeReport.arrayReport(arrInteger);

        // List Integer Report
        System.out.println();
        System.out.println("| LIST DATA STRUCTURE |");
        printLine();
        integerTimeReport.listReport(listInteger);


        System.out.print("String array to sort: ");
        System.out.println(Arrays.toString(arrString));

        // Array Strings Report
        System.out.println();
        System.out.println("| ARRAY DATA STRUCTURE | ");
        printLine();
        stringTimeReport.arrayReport(arrString);


        // List String Report
        System.out.println();
        System.out.println("| LIST DATA STRUCTURE |");
        printLine();
        stringTimeReport.listReport(listString);

    }

    private void listReport(List<T> list) {
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(list);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }
    }

    private void arrayReport(T[] arr) {
        for(int i = 0; i < algorithmName.size(); i++){
            long startTime = System.currentTimeMillis();
            Sorter sorter = SortingFactory.sortingFactory(i + 1);
            sorter.sortingAlgorithm(arr);
            System.out.println(algorithmName.get(i));
            DisplayFunctions.displayTimeTaken(startTime);
        }
    }

    private static void printLine() {
        System.out.println(Stream.generate(() -> "-")
                .limit(40)
                .collect(Collectors.joining()));
    }
}
