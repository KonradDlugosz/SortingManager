package com.sparta.controller;

import com.sparta.model.factory.SortingFactory;
import com.sparta.model.generator.TimeReport;
import com.sparta.view.DisplayFunctions;
import com.sparta.view.DisplaySortingResults;

import java.sql.Time;
import java.util.Scanner;

import static com.sparta.SortingDriver.*;


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
                logger.info("User selected: Sorting menu");
                int datatype = 1;
                while(datatype != 0 ){
                    DisplayFunctions.displayDataType();
                    datatype = CheckInput.checkInputMenuForException(2);

                    if(datatype == 1 || datatype == 2){

                        int dataMenu = 1;
                        while(dataMenu != 0){
                            DisplayFunctions.displayDataMenu();
                            dataMenu = CheckInput.checkInputMenuForException(3);

                            if(dataMenu == 1){
                                logger.info("Data structure choice: ArrayList");
                                // ArrayList
                                int sortMenu = 1;
                                while (sortMenu != 0){
                                    DisplayFunctions.displaySortingFunctions();
                                    sortMenu = CheckInput.checkInputMenuForException(5);
                                    if(sortMenu == 1){
                                        logger.info("Running bubble sort...");
                                        //Bubble sort -> ArrayList
                                        DisplayFunctions.displaySortType("BubbleSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),1, datatype);
                                    } else if(sortMenu == 2){
                                        logger.info("Running bubble sort recursive...");
                                        //Bubble sort Recursive -> ArrayList
                                        DisplayFunctions.displaySortType("BubbleSortRecursive");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 1, datatype);
                                    } else if(sortMenu == 3){
                                        logger.info("Running quick sort...");
                                        //Quick sort -> ArrayList
                                        DisplayFunctions.displaySortType("QuickSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 1, datatype);
                                    } else if(sortMenu == 4){
                                        logger.info("Running tim sort...");
                                        DisplayFunctions.displaySortType("TimSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 1, datatype);
                                    }  else if(sortMenu == 5){
                                        logger.info("Running tree sort...");
                                        DisplayFunctions.displaySortType("TreeSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 1, datatype);
                                    }else if(sortMenu == 0){
                                        sortMenu = 0;
                                    }
                                }


                            } else if(dataMenu == 2){
                                logger.info("Data structure choice: LinkedList");
                                // LinkedList
                                int sortMenu = 1;
                                while (sortMenu != 0){
                                    DisplayFunctions.displaySortingFunctions();
                                    sortMenu = CheckInput.checkInputMenuForException(5);
                                    if(sortMenu == 1){
                                        logger.info("Running bubble sort...");
                                        //Bubble sort -> LinkedList
                                        DisplayFunctions.displaySortType("BubbleSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 2,datatype);
                                    } else if(sortMenu == 2){
                                        logger.info("Running bubble sort recursive...");
                                        //Bubble sort Recursive -> LinkedList
                                        DisplayFunctions.displaySortType("BubbleSortRecursive");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),2, datatype);
                                    } else if(sortMenu == 3){
                                        logger.info("Running quick sort...");
                                        //Quick sort -> LinkedList
                                        DisplayFunctions.displaySortType("QuickSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),2, datatype);
                                    } else if(sortMenu == 4){
                                        logger.info("Running tim sort...");
                                        DisplayFunctions.displaySortType("TimSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),2, datatype);
                                    } else if(sortMenu == 5){
                                        logger.info("Running tree sort...");
                                        DisplayFunctions.displaySortType("TreeSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu), 2, datatype);
                                    }
                                    else if(sortMenu == 0){
                                        sortMenu = 0;
                                    }
                                }



                            } else if(dataMenu == 3){
                                logger.info("Data structure choice: Array");
                                // Array
                                int sortMenu = 1;
                                while (sortMenu != 0){
                                    DisplayFunctions.displaySortingFunctions();
                                    sortMenu = CheckInput.checkInputMenuForException(5);
                                    if(sortMenu == 1){
                                        logger.info("Running bubble sort...");
                                        //Bubble sort -> Array
                                        DisplayFunctions.displaySortType("BubbleSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),  datatype);
                                    } else if(sortMenu == 2){
                                        logger.info("Running bubble sort recursive...");
                                        //Bubble sort Recursive -> Array
                                        DisplayFunctions.displaySortType("BubbleSortRecursive");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),  datatype);
                                    } else if(sortMenu == 3){
                                        logger.info("Running quick sort...");
                                        //Quick sort -> Array
                                        DisplayFunctions.displaySortType("QuickSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),  datatype);
                                    } else if(sortMenu == 4){
                                        logger.info("Running tim sort...");
                                        DisplayFunctions.displaySortType("TimSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),  datatype);
                                    } else if(sortMenu == 5){
                                        logger.info("Running tree sort...");
                                        DisplayFunctions.displaySortType("TreeSort");
                                        DisplaySortingResults.displaySortingResult(SortingFactory.sortingFactory(sortMenu),  datatype);
                                    } else if(sortMenu == 0){
                                        sortMenu = 0;
                                    }
                                }
                            } else if(dataMenu == 0){
                                dataMenu = 0;
                            }
                        }
                    }
                }


                // show current array
            } else if(selectedMenu == 2){
                int dataType = 1;
                while(dataType != 0){
                    DisplayFunctions.displayDataType();
                    dataType = CheckInput.checkInputMenuForException(2);
                    //Integer or String array
                    if(dataType == 1){
                        DisplayFunctions.displayCurrentRandomArrayInteger();
                        logger.info("Display current integer array");
                    } else if(dataType == 2){
                        DisplayFunctions.displayCurrentRandomArrayString();
                        logger.info("Display current string array");
                    }
                }
            }

            // Update random array param
            else if(selectedMenu == 3){
                int dataType = 1;

                while(dataType != 0){
                    DisplayFunctions.displayDataType();
                    dataType = CheckInput.checkInputMenuForException(2);

                    //Update integer or string params
                    if(dataType == 1){
                        //Integer
                        int updateMenu = 1;
                        while (updateMenu != 0){
                            DisplayFunctions.displayUpdateArrayIntegerParams();
                            String isCorrect = scan.next();
                            if(isCorrect.equals("yes") ){ // TODO Exception check for wrong input!
                                updateMenu = 0;
                                dataType = 0;
                            } else if(isCorrect.equals("no")){
                                updateMenu = 1;
                            } else {
                                System.out.println("Wrong input");
                            }
                            logger.info("User updated random integer array params: " + "Length: " + arrayIntegerGenerator.getLength() +
                                    " Start: " + arrayIntegerGenerator.getStart() + " End: " + arrayIntegerGenerator.getEnd() + " Seed: " + arrayIntegerGenerator.getSeed());
                        }

                        //String
                    } else if(dataType == 2){
                        //String
                        int updateMenu = 1;
                        while (updateMenu != 0){
                            DisplayFunctions.displayUpdateArrayStringParams();
                            String isCorrect = scan.next();
                            if(isCorrect.equals("yes") ){
                                updateMenu = 0;
                                dataType = 0;
                            } else if(isCorrect.equals("no")){ // TODO Exception check for wrong input!
                                updateMenu = 1;
                            } else {
                                System.out.println("Wrong input");
                            }
                            logger.info("User updated random string array params: " + "Length: " + arrayStringGenerator.getLength() +
                                    " Char per string: " + arrayStringGenerator.getSizePerString() + " Seed: " + arrayStringGenerator.getSeed());
                        }
                    }
                }
            }

            // Get performance report
            else if (selectedMenu == 4){
                System.out.println("Generating report...");
                logger.info("User selected: Generate report");
                TimeReport.GenerateTimeReport();
            }

            // Exit
            else if(selectedMenu == 0){
                logger.info("Exit application");
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}
