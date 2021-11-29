package com.sparta.model.array;

public class SortingFactory {

    private static SorterArray sorterArray;

    public static SorterArray sortingFactory(int selected) {

        if(selected == 1){
            sorterArray = new BubbleSortImpl();
        } else if(selected == 2){
            sorterArray = new BubbleSortRecursionImpl();
        } else if (selected == 3){
            sorterArray = new QuickSortImpl();
        }

        return sorterArray;

    }

}
