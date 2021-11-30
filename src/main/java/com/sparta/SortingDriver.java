package com.sparta;

import com.sparta.controller.UserInterface;
import com.sparta.model.ArrayGenerator;
import com.sparta.model.CustomList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingDriver {

    public static ArrayGenerator arrayGenerator;

    public static void main(String[] args) {
        arrayGenerator = new ArrayGenerator(1000, 1,10000, 50);
        UserInterface.runUserInterface();




//        List<Comparable> list = new ArrayList<>();

//        Scanner scan = new Scanner(System.in);
//        CustomList customList = new CustomList();
//
//        for(int i = 0; i < 5; i++){
//            customList.addData(scan.next());
//        }
//
//        System.out.println(customList.getData());


    }

}
