package com.sparta.model.test;

import com.sparta.model.ArrayIntegerGenerator;
import com.sparta.model.sorting.QuickSortImpl;
import com.sparta.model.sorting.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortAlgorithmTest {

    private static Sorter sorter;

    @BeforeAll
    public static void setUpAll(){
        sorter = new QuickSortImpl();
    }

    @Test
    @DisplayName("1. Given random array, Return sorted array")
    public void givenRandomArrayReturnSortedArray() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(150, 1,1000, 40);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {5, 5, 6, 6, 14, 15, 15, 16, 33, 37, 43, 51, 57, 58, 58, 59, 72, 74, 79, 94, 99, 101,
                108, 109, 117, 120, 128, 130, 133, 142, 149, 153, 159, 172, 173, 176, 197, 201, 214, 219, 222,
                224, 235, 239, 250, 254, 258, 261, 261, 302, 326, 359, 376, 380, 388, 392, 397, 398, 415, 415,
                421, 431, 431, 436, 436, 440, 451, 459, 469, 491, 491, 505, 514, 519, 522, 529, 548, 553, 555,
                562, 563, 590, 595, 598, 599, 616, 624, 641, 644, 644, 652, 662, 674, 682, 688, 690, 692, 697,
                697, 700, 701, 724, 726, 730, 730, 732, 735, 739, 749, 766, 771, 771, 778, 779, 790, 801, 801,
                802, 807, 813, 814, 822, 829, 842, 853, 861, 878, 885, 893, 893, 899, 901, 906, 916, 922, 931,
                931, 934, 936, 957, 957, 961, 966, 970, 974, 979, 982, 983, 992, 997};
        ;
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }

    @Test
    @DisplayName("2. Given empty array, Return empty array")
    public void givenEmptyArrayReturnEmptyArray(){
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(0, 1,1000, 50);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }

    @Test
    @DisplayName("3. Given negative length array, Return empty array")
    public void givenNegativeLengthArrayReturnEmptyArray(){
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(-10, 1,1000, 50);
        Integer [] actual = arrayIntegerGenerator.generateArray();
        sorter.sortingAlgorithm(actual);
        int [] expected = {};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));

    }
}
