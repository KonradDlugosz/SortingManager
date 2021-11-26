package com.sparta;

import com.sparta.controller.UserInteraction;
import com.sparta.model.ArrayGenerator;

public class SortingDriver {

    public static ArrayGenerator arrayGenerator;

    public static void main(String[] args) {
        arrayGenerator = new ArrayGenerator(1000, 1,100, 50);
        UserInteraction.runUserInterface();


    }

}
