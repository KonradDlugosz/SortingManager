package com.sparta.model.list;

public class SortingFactoryList {

    private static SorterList sorterList;

    public static SorterList sortingFactory(int selected) {

        if(selected == 1){
            sorterList = new BubbleSortImplList();
        } else if(selected == 2){
            sorterList = new BubbleSortRecursiveImplList();
        } else if(selected == 3){
            sorterList = new QuickSortImplList();
        }

        return sorterList;

    }
}
