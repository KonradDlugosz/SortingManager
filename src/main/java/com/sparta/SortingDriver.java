package com.sparta;

import com.sparta.controller.UserInterface;
import com.sparta.model.ArrayIntegerGenerator;
import com.sparta.model.ArrayStringGenerator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;


public class SortingDriver {

    public static ArrayIntegerGenerator arrayIntegerGenerator;
    public static ArrayStringGenerator arrayStringGenerator;
    public static Logger logger = LogManager.getLogger("Sorting Manager");

    public static void main(String[] args) {
        arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,10000, 50);
        arrayStringGenerator = new ArrayStringGenerator(100,4,50);

        UserInterface.runUserInterface();
    }

}
