package com.sparta.model.test.generator;

import com.sparta.model.generator.ArrayIntegerGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayIntegerGeneratorTest {
    @Test
    @DisplayName("1. Given length 50 and seed 50, return array of n random numbers")
    public void givenLengthOfFiftyReturnRandomArray(){
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(50, 1,1000, 50);
        int []expected = {734, 637, 408, 800, 923, 104, 521, 370, 892, 89, 597, 66, 400, 9,
                126, 604, 663, 813, 150, 476, 378, 379, 140, 56, 186, 261, 101, 453, 61, 510, 102,
                973, 120, 979, 372, 297, 450, 969, 306, 964, 844, 608, 727, 759, 271, 308, 540, 342, 384, 963};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayIntegerGenerator.generateArray()));
    }


    @Test
    @DisplayName("2. Given length zero, return empty array")
    public void givenLengthOfZeroReturnZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(0, 1,1000, 50);
        int [] expected = {};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayIntegerGenerator.generateArray()));
    }

    @Test
    @DisplayName("3. Given length negative length, return empty array")
    public void givenLengthNegativeReturnZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(-1, 1,1000, 50);
        int [] expected = {};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayIntegerGenerator.generateArray()));
    }

    @Test
    @DisplayName("4. Given negative length, return length of zero")
    public void givenLengthNegativeReturnLengthZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,100, 50);
        arrayIntegerGenerator.setLength(-40);
        assertEquals(0, arrayIntegerGenerator.getLength());
    }

    @Test
    @DisplayName("5. Given negative start, return start of zero")
    public void givenNegativeStartReturnStartZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,100, 50);
        arrayIntegerGenerator.setStart(-15);
        assertEquals(0, arrayIntegerGenerator.getStart());
    }
    @Test
    @DisplayName("6. Given negative end, return end of zero")
    public void givenNegativeEndReturnEndZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,100, 50);
        arrayIntegerGenerator.setEnd(-20);
        assertEquals(0, arrayIntegerGenerator.getEnd());
    }
    @Test
    @DisplayName("7. Given negative seed, return seed of zero")
    public void givenNegativeSeedReturnSeedZero() {
        ArrayIntegerGenerator arrayIntegerGenerator = new ArrayIntegerGenerator(1000, 1,100, 50);
        arrayIntegerGenerator.setSeed(-30);
        assertEquals(0, arrayIntegerGenerator.getSeed());
    }

}
