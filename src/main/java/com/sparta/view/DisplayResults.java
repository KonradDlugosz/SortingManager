package com.sparta.view;

import com.sparta.model.sorting.Sorter;
import com.sparta.model.sorting.ListFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.sparta.SortingDriver.arrayIntegerGenerator;

public class DisplayResults {



    //TODO Duplicated code/ Create separate function for timing.
    public static void displaySortingArrayResult(Sorter sorter, String method){

        if(method.equals("TimSort")){

            Integer[] arr = arrayIntegerGenerator.generateArray();//
            long startTime = System.currentTimeMillis();
            Arrays.sort(arr);//
            System.out.println(Arrays.toString(arr));
            displayTimeTaken(startTime);


        } else {
            Integer[] arr = arrayIntegerGenerator.generateArray();//
            long startTime = System.currentTimeMillis();
            sorter.sortingAlgorithm(arr);//
            System.out.println(Arrays.toString(arr));
            displayTimeTaken(startTime);
        }

    }

    public static void displaySortingListResult(Sorter sorter, String method, int choice){



        if(method.equals("TimSort")){
            List<Integer> list = ListFactory.listFactory(arrayIntegerGenerator.generateArray(), choice);//
            long startTime = System.currentTimeMillis();
            Collections.sort(list);//
            System.out.println(list);
            displayTimeTaken(startTime);

        }
        else{
            List<Integer> list = ListFactory.listFactory(arrayIntegerGenerator.generateArray(), choice);//
            long startTime = System.currentTimeMillis();
            sorter.sortingAlgorithm(list);//
            System.out.println(list);
            displayTimeTaken(startTime);

        }

    }

    public static void displayTimeTaken(long startTime){
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken: " + timeTaken + " ms");
        System.out.println();

    }


}
