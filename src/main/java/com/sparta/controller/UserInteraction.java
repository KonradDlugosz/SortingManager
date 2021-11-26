package com.sparta.controller;

import com.sparta.model.SortingFactory;
import com.sparta.view.DisplayResults;

import java.util.Arrays;
import java.util.Scanner;

import static com.sparta.SortingDriver.arrayGenerator;

public class UserInteraction {

    public static void runUserInterface() {


        Scanner scan = new Scanner(System.in);
        int selectedMenu = 1;

        while (selectedMenu != 0){
            displayMainMenu();
            selectedMenu = scan.nextInt();
            if (selectedMenu == 1){
                int subMenu = 1;
                while(subMenu != 0){
                    displaySortingMenu();
                    subMenu = scan.nextInt();
                    if(subMenu == 1){
                        DisplayResults.displaySortingResult(SortingFactory.sortingFactory(subMenu), "BubbleSort");
                    } else if (subMenu == 2){
                        DisplayResults.displaySortingResult(SortingFactory.sortingFactory(subMenu), "BubbleSortRecursive");
                    } else if (subMenu == 3){
                        DisplayResults.displaySortingResult(SortingFactory.sortingFactory(subMenu), "QuickSort");
                    } else if (subMenu == 0){
                        subMenu = 0;
                    } else {
                        System.out.println("Ops! Wrong input!!!");
                    }
                }
            } else if (selectedMenu == 2){
                System.out.println(Arrays.toString(arrayGenerator.generateArray()));
                System.out.println();
            } else if(selectedMenu == 3){
                int subMenu = 1;
                while (subMenu != 0){
                    displayUpdateArrayParams();
                    String isCorrect = scan.next();
                    if(isCorrect.equals("yes") ){
                        subMenu = 0;
                    } else if(isCorrect.equals("no")){
                        subMenu = 1;
                    }else {
                        System.out.println("Wrong option!");
                    }
                }
            } else if(selectedMenu == 0){
                System.out.println("Bye!");
                System.exit(0);
            } else {
                System.out.println("Ops. Wrong input !!!");
            }
        }
    }

    private static void displayUpdateArrayParams() {
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

    private static void displaySortingMenu() {
        System.out.println("Select sorting algorithm: ");
        System.out.println("    1. Bubble Sort (Nested For loop)");
        System.out.println("    2. Bubble Sort (Recursive)");
        System.out.println("    3. Quick Sort");
        System.out.println("    0. <<<");
    }

    private static void displayMainMenu() {
        System.out.println("Sorting Manager Menu: ");
        System.out.println("    1. Sort Methods");
        System.out.println("    2. Display Current Random Array");
        System.out.println("    3. Update Random Array Parameters");
        System.out.println("    0. Exit");
    }


}
