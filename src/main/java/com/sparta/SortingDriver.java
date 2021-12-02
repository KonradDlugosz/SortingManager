package com.sparta;

import com.sparta.controller.UserInterface;
import com.sparta.model.generator.ArrayIntegerGenerator;
import com.sparta.model.generator.ArrayStringGenerator;
import com.sparta.model.generator.TimeReport;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SortingDriver {

    public static ArrayIntegerGenerator arrayIntegerGenerator;
    public static ArrayStringGenerator arrayStringGenerator;
    public static Logger logger = LogManager.getLogger("Sorting Manager");

    public static void main(String[] args) {
        arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,10000, 50);
        arrayStringGenerator = new ArrayStringGenerator(100,4,50);

        //UserInterface.runUserInterface();

        TimeReport.GenerateTimeReport();


//        //Tree sort testing
//        Integer [] arr = arrayIntegerGenerator.generateArray();
//        System.out.println(Arrays.toString(arr));
//        TreeSortImpl treeSort = new TreeSortImpl();
//        treeSort.sortingAlgorithm(arr);
//        System.out.println(Arrays.toString(arr));
//
//
//        List<Integer> list = new ArrayList<>(List.of(arrayIntegerGenerator.generateArray()));
//        System.out.println(list);
//        TreeSortImpl treeSortList = new TreeSortImpl();
//        treeSortList.sortingAlgorithm(list);
//        System.out.println(list);
//
//
//        String [] arrS = arrayStringGenerator.generateArray();
//        System.out.println(Arrays.toString(arrS));
//        TreeSortImpl treeSort2 = new TreeSortImpl();
//        treeSort2.sortingAlgorithm(arrS);
//        System.out.println(Arrays.toString(arrS));



    }

}
