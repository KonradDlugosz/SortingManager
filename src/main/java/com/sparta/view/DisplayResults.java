package com.sparta.view;

import com.sparta.model.array.SorterArray;
import com.sparta.model.list.ListFactory;
import com.sparta.model.list.SorterList;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.sparta.SortingDriver.arrayGenerator;

public class DisplayResults {


    public static void displaySortingArrayResult(SorterArray sorterArray, String method){

        if(method.equals("TimSort")){

            int[] arr = arrayGenerator.generateArray();
            long startTime = System.currentTimeMillis();
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " ms");
            System.out.println();


        } else {
            int[] arr = arrayGenerator.generateArray();
            long startTime = System.currentTimeMillis();
            sorterArray.sortingAlgorithm(arr);
            System.out.println(Arrays.toString(arr));

            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " ms");
            System.out.println();
        }

    }

    public static void displaySortingListResult(SorterList sorterList, String method, int choice){



        if(method.equals("TimSort")){
            List<Integer> list = ListFactory.listFactory(arrayGenerator.generateArray(), choice);
            long startTime = System.currentTimeMillis();
            Collections.sort(list);
            System.out.println(list);

            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " ms");
            System.out.println();
        }
        else{
            List<Integer> list = ListFactory.listFactory(arrayGenerator.generateArray(), choice);
            long startTime = System.currentTimeMillis();
            sorterList.sortingAlgorithm(list);
            System.out.println(list);

            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " ms");
            System.out.println();

        }

    }


}
