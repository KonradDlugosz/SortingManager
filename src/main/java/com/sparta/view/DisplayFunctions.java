package com.sparta.view;

import java.util.Arrays;
import java.util.Scanner;

import static com.sparta.SortingDriver.arrayGenerator;

public class DisplayFunctions {


    public static void displayWelcome(){
        System.out.println("    WELCOME TO SORTING MANAGER");
        System.out.println("   ** use NUMBERS to navigate **");
        System.out.println();
    }

    public static void displayMainMenu() {
        System.out.println("MAIN MENU: ");
        System.out.println("    1. Sort data structure");
        System.out.println("    2. Display Current Random Array");
        System.out.println("    3. Update Random Array Parameters");
        System.out.println("    4. Get performance report.");
        System.out.println("    0. Exit");
    }

    public static void displayDataMenu() {
        System.out.println("Select data structure: ");
        System.out.println("    1. ArrayList");
        System.out.println("    2. LinkedList");
        System.out.println("    3. Array");
        System.out.println("    0. <<<");
    }

    public static void displaySortingFunctions() {
        System.out.println("Select sorting algorithm: ");
        System.out.println("    1. Bubble Sort");
        System.out.println("    2. Bubble Sort Recursive");
        System.out.println("    3. Quick Sort");
        System.out.println("    4. Tim Sort");
        System.out.println("    0. <<<");
    }


    public static void displayUpdateArrayParams() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Update array parameters: ");
        System.out.println("Length: ");
        arrayGenerator.setLength(scan.nextInt());
        System.out.println("Start: ");
        arrayGenerator.setStart(scan.nextInt());
        System.out.println("End: ");
        arrayGenerator.setEnd(scan.nextInt());
        System.out.println("Seed: ");
        arrayGenerator.setSeed(scan.nextInt());
        System.out.println("New parameters: ");
        System.out.println("Length: " + arrayGenerator.getLength() );
        System.out.println("Start: " + arrayGenerator.getStart() );
        System.out.println("End: " + arrayGenerator.getEnd() );
        System.out.println("Seed: " + arrayGenerator.getSeed() );
        System.out.println("Is this correct? (yes/no)");
    }

    public static void displaySortType(String method){
        switch (method) {
            case "BubbleSort" -> System.out.println("Bubble Sort (Nested For Loop):");
            case "BubbleSortRecursive" -> System.out.println("Bubble Sort (Recursive):");
            case "QuickSort" -> System.out.println("Quick Sort: ");
            case "TimSort" -> System.out.println("TimSort: ");
        }
    }

    public static void displayCurrentRandomArray(){
        System.out.print("Random array: ");
        System.out.println(Arrays.toString(arrayGenerator.generateArray()));
        System.out.println();
        System.out.println("Parameters: ");
        System.out.println("Length: " + arrayGenerator.getLength());
        System.out.println("Start: " + arrayGenerator.getStart());
        System.out.println("End: " + arrayGenerator.getEnd());
        System.out.println("Seed: " + arrayGenerator.getSeed());
        System.out.println();
    }

}
