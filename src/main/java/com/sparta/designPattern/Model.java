package com.sparta.designPattern;

import com.sparta.sortingAlgorithm.*;

public class Model {

    private static Sorter sorter;
    public static ArrayGenerator arrayGenerator;

    public static Sorter sortingFactory(int selected) {

        if(selected == 1){
            sorter = new BubbleSortImpl();
        } else if(selected == 2){
            sorter = new BubbleSortRecursionImpl();
        } else if (selected == 3){
            sorter = new QuickSortImpl();
        }

        return sorter;

    }

    public static void createDefaultRandomArray(){
        arrayGenerator = new ArrayGenerator(1000, 1,100, 50);

    }

}
