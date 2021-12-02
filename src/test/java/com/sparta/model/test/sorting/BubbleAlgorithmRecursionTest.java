package com.sparta.model.test.sorting;

import com.sparta.model.generator.ArrayIntegerGenerator;
import com.sparta.model.sorting.BubbleSortRecursionImpl;
import com.sparta.model.sorting.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleAlgorithmRecursionTest {

    private static Sorter sorter;

    @BeforeAll
    public static void setUpAll(){
        sorter = new BubbleSortRecursionImpl();
    }

    @Test
    @DisplayName("1 Given random array, Return sorted array")
    public void givenRandomArrayReturnSortedArrayMethod2() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(100, 1,1000, 50);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {9, 13, 54, 55, 56, 61, 66, 72, 89, 93, 101, 102, 104, 120, 126, 137, 140, 145, 146,
                150, 165, 186, 186, 198, 203, 204, 204, 229, 255, 261, 271, 272, 292, 295, 297, 306, 308, 314,
                342, 370, 372, 378, 379, 384, 400, 408, 408, 434, 437, 450, 453, 464, 476, 490, 510, 521, 540,
                561, 590, 591, 594, 597, 604, 608, 637, 662, 663, 666, 669, 708, 709, 723, 727, 728, 730, 734,
                740, 748, 759, 791, 800, 810, 811, 813, 827, 830, 844, 860, 871, 892, 923, 930, 940, 956, 958,
                963, 964, 969, 973, 979};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    @DisplayName("2. Given empty array, Return empty array")
    public void givenEmptyArrayReturnEmptyArrayMethod2(){
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(0, 1,1000, 50);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }

    @Test
    @DisplayName("3. Given negative length array, Return empty array")
    public void givenNegativeLengthArrayReturnEmptyArrayMethod2(){
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(-10, 1,1000, 50);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }
}
