package com.sparta.view;

import java.util.Arrays;
import java.util.Scanner;

import static com.sparta.SortingDriver.arrayIntegerGenerator;
import static com.sparta.SortingDriver.arrayStringGenerator;

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

    public static void displayDataType(){
        System.out.println("Select data type: ");
        System.out.println("    1. Integers");
        System.out.println("    2. Strings");
        System.out.println("    0. <<<");
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


    public static void displayUpdateArrayIntegerParams() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Update array parameters: ");
        System.out.println("Length: ");
        arrayIntegerGenerator.setLength(scan.nextInt());
        System.out.println("Start: ");
        arrayIntegerGenerator.setStart(scan.nextInt());
        System.out.println("End: ");
        arrayIntegerGenerator.setEnd(scan.nextInt());
        System.out.println("Seed: ");
        arrayIntegerGenerator.setSeed(scan.nextInt());
        System.out.println("New parameters: ");
        System.out.println("Length: " + arrayIntegerGenerator.getLength() );
        System.out.println("Start: " + arrayIntegerGenerator.getStart() );
        System.out.println("End: " + arrayIntegerGenerator.getEnd() );
        System.out.println("Seed: " + arrayIntegerGenerator.getSeed() );
        System.out.println("Is this correct? (yes/no)");
    }

    public static void displayUpdateArrayStringParams() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Update array parameters: ");
        System.out.println("Length: ");
        arrayStringGenerator.setLength(scan.nextInt());
        System.out.println("Char per string: ");
        arrayStringGenerator.setSizePerString(scan.nextInt());
        System.out.println("Seed: ");
        arrayStringGenerator.setSeed(scan.nextInt());
        System.out.println("New parameters: ");
        System.out.println("Length: " + arrayStringGenerator.getLength());
        System.out.println("Char per string: " + arrayStringGenerator.getSizePerString());
        System.out.println("Seed: " + arrayStringGenerator.getSeed());
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

    public static void displayCurrentRandomArrayInteger(){
        System.out.print("Random integer array: ");
        System.out.println(Arrays.toString(arrayIntegerGenerator.generateArray()));
        System.out.println();
        System.out.println("Parameters: ");
        System.out.println("Length: " + arrayIntegerGenerator.getLength());
        System.out.println("Start: " + arrayIntegerGenerator.getStart());
        System.out.println("End: " + arrayIntegerGenerator.getEnd());
        System.out.println("Seed: " + arrayIntegerGenerator.getSeed());
        System.out.println();
    }

    public static void displayCurrentRandomArrayString(){
        System.out.print("Random string array: ");
        System.out.println(Arrays.toString(arrayStringGenerator.generateArray()));
        System.out.println();
        System.out.println("Parameters: ");
        System.out.println("Length: " + arrayStringGenerator.getLength());
        System.out.println("Char per string: " + arrayStringGenerator.getSizePerString());
        System.out.println("Seed: " + arrayStringGenerator.getSeed());
        System.out.println();
    }

    public static void displayTimeTaken(long startTime){
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println();

    }

}
