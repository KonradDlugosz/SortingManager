package com.sparta.view;

import com.sparta.model.RunSorting;
import com.sparta.model.factory.ListFactory;
import com.sparta.model.sorting.Sorter;

import java.util.List;

import static com.sparta.SortingDriver.*;

public class DisplaySortingResults {

    public static RunSorting runSorting = new RunSorting();
    public static ListFactory listFactory = new ListFactory();

    public static void displaySortingResult(Sorter sorter, int dataType){

        if(dataType == 1){
            Integer [] arr = arrayIntegerGenerator.generateArray();
            runSorting.runSorting(sorter, arr);
        } else if(dataType == 2){
            String [] arr = arrayStringGenerator.generateArray();
            runSorting.runSorting(sorter, arr);
        }
    }

    public static void displaySortingResult(Sorter sorter, int choice, int dataType){

        if(dataType == 1){
            List<Integer> list = listFactory.listFactory(arrayIntegerGenerator.generateArray(), choice);
            runSorting.runSorting(sorter, list);
        } else if(dataType == 2){
            List<String> list = listFactory.listFactory(arrayStringGenerator.generateArray(), choice);//
            runSorting.runSorting(sorter, list);
        }
    }

}
