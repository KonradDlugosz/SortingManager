package com.sparta;

import com.sparta.controller.UserInterface;
import com.sparta.model.ArrayIntegerGenerator;
import com.sparta.model.ArrayStringGenerator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SortingDriver {

    public static ArrayIntegerGenerator arrayIntegerGenerator;
    public static ArrayStringGenerator arrayStringGenerator;
    public static Logger logger = LogManager.getLogger("Sorting Manager");

    public static void main(String[] args) {
        arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,10000, 50);
        arrayStringGenerator = new ArrayStringGenerator(100,4,50);

        UserInterface.runUserInterface();



        //Tree sort testing
//        Integer [] arr = arrayIntegerGenerator.generateArray();
//        System.out.println(Arrays.toString(arr));
//        TreeSortImpl treeSort = new TreeSortImpl();
//        treeSort.sortingAlgorithm(arr);
//        System.out.println(Arrays.toString(arr));
//
//        Integer [] arr2 = arrayIntegerGenerator.generateArray();
//        System.out.println(Arrays.toString(arr2));
//        BubbleSortImpl bubbleSort = new BubbleSortImpl();
//        bubbleSort.sortingAlgorithm(arr2);
//        System.out.println(Arrays.toString(arr2));

    }

}
