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

    }

}
