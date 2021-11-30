package com.sparta.controller;

import com.sparta.model.array.SortingFactory;
import com.sparta.model.list.SortingFactoryList;
import com.sparta.view.DisplayFunctions;
import com.sparta.view.DisplayResults;

import java.util.Scanner;


public class UserInterface {

    public static void runUserInterface()  {

        Scanner scan = new Scanner(System.in);

        DisplayFunctions.displayWelcome();
        int selectedMenu = 1;

        // Main Menu
        while (selectedMenu != 0){
            DisplayFunctions.displayMainMenu();
            selectedMenu = CheckInput.checkInputMenuForException(4);


            //Show data structure menu:
            if(selectedMenu == 1){
                int dataMenu = 1;

                while(dataMenu != 0){
                    DisplayFunctions.displayDataMenu();
                    dataMenu = CheckInput.checkInputMenuForException(3);

                    if(dataMenu == 1){
                        // ArrayList
                        int sortMenu = 1;
                        while (sortMenu != 0){

                            DisplayFunctions.displaySortingFunctions();
                            sortMenu = CheckInput.checkInputMenuForException(4);
                            if(sortMenu == 1){
                                //Bubble sort -> ArrayList
                                DisplayFunctions.displaySortType("BubbleSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"BubbleSort", 1);
                            } else if(sortMenu == 2){
                                //Bubble sort Recursive -> ArrayList
                                DisplayFunctions.displaySortType("BubbleSortRecursive");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu), "BubbleSortRecursive",1);
                            } else if(sortMenu == 3){
                                //Quick sort -> ArrayList
                                DisplayFunctions.displaySortType("QuickSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"QuickSort", 1);
                            } else if(sortMenu == 4){
                                DisplayFunctions.displaySortType("TimSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"TimSort", 1);
                            }  else if(sortMenu == 0){
                                sortMenu = 0;
                            } else {
                                System.out.println("Ops! Wrong input!!!");
                            }
                        }


                    } else if(dataMenu == 2){
                        // LinkedList
                        int sortMenu = 1;
                        while (sortMenu != 0){
                            DisplayFunctions.displaySortingFunctions();
                            sortMenu = CheckInput.checkInputMenuForException(4);
                            if(sortMenu == 1){
                                //Bubble sort -> LinkedList
                                DisplayFunctions.displaySortType("BubbleSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"BubbleSort", 2);
                            } else if(sortMenu == 2){
                                //Bubble sort Recursive -> LinkedList
                                DisplayFunctions.displaySortType("BubbleSortRecursive");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"BubbleSortRecursive", 2);
                            } else if(sortMenu == 3){
                                //Quick sort -> LinkedList
                                DisplayFunctions.displaySortType("QuickSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"QuickSort", 2);
                            } else if(sortMenu == 4){
                                DisplayFunctions.displaySortType("TimSort");
                                DisplayResults.displaySortingListResult(SortingFactoryList.sortingFactory(sortMenu),"TimSort", 2);
                            } else if(sortMenu == 0){
                                sortMenu = 0;
                            } else {
                                System.out.println("Ops! Wrong input!!!");
                            }
                        }



                    } else if(dataMenu == 3){
                        // Array
                        int sortMenu = 1;
                        while (sortMenu != 0){
                            DisplayFunctions.displaySortingFunctions();
                            sortMenu = CheckInput.checkInputMenuForException(4);
                            if(sortMenu == 1){
                                //Bubble sort -> Array
                                DisplayFunctions.displaySortType("BubbleSort");
                                DisplayResults.displaySortingArrayResult(SortingFactory.sortingFactory(sortMenu), "BubbleSort");
                            } else if(sortMenu == 2){
                                //Bubble sort Recursive -> Array
                                DisplayFunctions.displaySortType("BubbleSortRecursive");
                                DisplayResults.displaySortingArrayResult(SortingFactory.sortingFactory(sortMenu), "BubbleSortRecursive");
                            } else if(sortMenu == 3){
                                //Quick sort -> Array
                                DisplayFunctions.displaySortType("QuickSort");
                                DisplayResults.displaySortingArrayResult(SortingFactory.sortingFactory(sortMenu), "QuickSort");
                            } else if(sortMenu == 4){
                                DisplayFunctions.displaySortType("TimSort");
                                DisplayResults.displaySortingArrayResult(SortingFactory.sortingFactory(sortMenu), "TimSort");
                            }  else if(sortMenu == 0){
                                sortMenu = 0;
                            } else {
                                System.out.println("Ops! Wrong input!!!");
                            }
                        }
                    } else if(dataMenu == 0){
                        dataMenu = 0;
                    }
                }

                // show current array
            } else if(selectedMenu == 2){
                DisplayFunctions.displayCurrentRandomArray();
            }

            // Update random array param
            else if(selectedMenu == 3){
                int updateMenu = 1;
                while (updateMenu != 0){
                    DisplayFunctions.displayUpdateArrayParams();
                    String isCorrect = scan.next();
                    if(isCorrect.equals("yes") ){
                        updateMenu = 0;
                    } else if(isCorrect.equals("no")){
                        updateMenu = 1;
                    }
                }
            }

            // Get performance report
            else if (selectedMenu == 4){
                System.out.println("Generating report...");
                // TODO Time performance
            }

            // Exit
            else if(selectedMenu == 0){
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}
