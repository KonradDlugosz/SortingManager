package com.sparta.model.test.generator;

import com.sparta.model.generator.ArrayIntegerGenerator;
import com.sparta.model.generator.ArrayStringGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStringGeneratorTest {

    @Test
    @DisplayName("1. Given length 50 and seed 50, return array of n random numbers")
    public void givenLengthOfFiftyReturnRandomArray(){
        ArrayStringGenerator arrayStringGenerator = new ArrayStringGenerator(20, 8,50);
        String [] expected = {"lgtapfaa", "eycoyxue", "mfvurhnl", "gaktgmaf", "ugkguies", "dbbfzcqb", "mbxkkmjb",
                "mfyrqhiu", "jmgzuvlz", "pakomdin", "urjqkpzl", "gklnppgp", "tckgytaz", "acyudnni", "nvniorqv",
                "gvbtgihp", "uczqrvko", "kyzplzpy", "lieztcux", "qkempvey"};

        assertEquals(Arrays.toString(expected),Arrays.toString(arrayStringGenerator.generateArray()));
    }

    @Test
    @DisplayName("2. Given length zero, return empty array")
    public void givenLengthOfZeroReturnZero() {
        ArrayStringGenerator arrayStringGenerator = new ArrayStringGenerator(0, 8,50);
        String [] expected = {};

        assertEquals(Arrays.toString(expected),Arrays.toString(arrayStringGenerator.generateArray()));
    }

    @Test
    @DisplayName("3. Given length negative length, return empty array")
    public void givenLengthNegativeReturnZero() {
        ArrayStringGenerator arrayStringGenerator = new ArrayStringGenerator(-2, 8,50);
        String [] expected = {};

        assertEquals(Arrays.toString(expected),Arrays.toString(arrayStringGenerator.generateArray()));
    }

    @Test
    @DisplayName("4. Given zero char per string, return empty array")
    public void givenZeroPerStringReturnEmptyArray(){
        ArrayStringGenerator arrayStringGenerator = new ArrayStringGenerator(10, 0,50);
        String [] expected = {};

        assertEquals(Arrays.toString(expected),Arrays.toString(arrayStringGenerator.generateArray()));
    }

    @Test
    @DisplayName("5. Given negativechar per string, return empty array")
    public void givenNegativePerStringReturnEmptyArray(){
        ArrayStringGenerator arrayStringGenerator = new ArrayStringGenerator(10, -20,50);
        String [] expected = {};

        assertEquals(Arrays.toString(expected),Arrays.toString(arrayStringGenerator.generateArray()));
    }

}
