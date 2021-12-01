package com.sparta.model.sorting;

public class SortingFactory {

    private static Sorter sorter;

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

}
