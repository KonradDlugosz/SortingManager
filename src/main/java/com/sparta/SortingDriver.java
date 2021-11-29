package com.sparta;

import com.sparta.controller.UserInterface;
import com.sparta.model.ArrayGenerator;

public class SortingDriver {

    public static ArrayGenerator arrayGenerator;

    public static void main(String[] args) {
        arrayGenerator = new ArrayGenerator(1000, 1,10000, 50);
        UserInterface.runUserInterface();

    }

}
