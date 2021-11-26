package com.sparta.designPattern;

import java.util.Scanner;

import static com.sparta.designPattern.Model.arrayGenerator;

public class Controller {

    public static void runUserInterface() {

        Model.createDefaultRandomArray();

        Scanner scan = new Scanner(System.in);
        int selectedMenu = 1;

        while (selectedMenu != 0){
            System.out.println("Sorting Manager Menu: ");
            System.out.println("    1. Sort Methods");
            System.out.println("    2. Random Array Parameters");
            System.out.println("    0. Exit");
            selectedMenu = scan.nextInt();

            if (selectedMenu == 1){
                int subMenu = 1;
                while(subMenu != 0){
                    System.out.println("Select sorting algorithm: ");
                    System.out.println("    1. Bubble Sort (Nested For loop)");
                    System.out.println("    2. Bubble Sort (Recursive)");
                    System.out.println("    3. Quick Sort");
                    System.out.println("    0. <<<");
                    subMenu = scan.nextInt();

                    if(subMenu == 1){
                        View.displaySortingResult(Model.sortingFactory(subMenu), "BubbleSort");
                    } else if (subMenu == 2){
                        View.displaySortingResult(Model.sortingFactory(subMenu), "BubbleSortRecursive");
                    } else if (subMenu == 3){
                        View.displaySortingResult(Model.sortingFactory(subMenu), "QuickSort");
                    } else if (subMenu == 0){
                        subMenu = 0;
                    } else {
                        System.out.println("Ops! Wrong input!!!");
                    }
                }
            } else if(selectedMenu == 2){
                int subMenu = 1;
                while (subMenu != 0){
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
                    String isCorrect = scan.next();
                    if(isCorrect.equals("yes")){
                        subMenu = 0;
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

}
