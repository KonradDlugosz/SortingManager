package com.sparta.model.factory;

import com.sparta.model.sorting.*;

public class SortingFactory {

    private static Sorter sorter;

    public static Sorter sortingFactory(int selected) {

        if(selected == 1){
            sorter = new BubbleSortImpl();
        } else if(selected == 2){
            sorter = new BubbleSortRecursionImpl();
        } else if (selected == 3){
            sorter = new QuickSortImpl();
        } else if (selected == 4){
            sorter = new TimSortImpl();
        } else if (selected == 5){
            sorter = new TreeSortImpl();
        }

        return sorter;

    }

}
