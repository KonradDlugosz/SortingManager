package com.sparta.sortingAlgorithm.test;

import com.sparta.sortingAlgorithm.ArrayGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayGeneratorTest {
    @Test
    @DisplayName("1. Given length 50 and seed 50, return array of n random numbers")
    public void givenLengthOfFiftyReturnRandomArray(){
        ArrayGenerator arrayGenerator = new ArrayGenerator(50, 1,1000, 50);
        int []expected = {734, 637, 408, 800, 923, 104, 521, 370, 892, 89, 597, 66, 400, 9,
                126, 604, 663, 813, 150, 476, 378, 379, 140, 56, 186, 261, 101, 453, 61, 510, 102,
                973, 120, 979, 372, 297, 450, 969, 306, 964, 844, 608, 727, 759, 271, 308, 540, 342, 384, 963};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayGenerator.generateArray()));
    }


    @Test
    @DisplayName("2. Given length zero, return empty array")
    public void givenLengthOfZeroReturnZero() {
        ArrayGenerator arrayGenerator = new ArrayGenerator(0, 1,1000, 50);
        int [] expected = {};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayGenerator.generateArray()));
    }

    @Test
    @DisplayName("3. Given length negative length, return empty array")
    public void givenLengthNegativeReturnZero() {
        ArrayGenerator arrayGenerator = new ArrayGenerator(-1, 1,1000, 50);
        int [] expected = {};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayGenerator.generateArray()));
    }

}
