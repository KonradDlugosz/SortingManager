package com.sparta.model.generator;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayStringGenerator {
    private int length;
    private int charPerString;
    private int seed;
    private static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public int getSizePerString() {
        return charPerString;
    }

    public void setSizePerString(int sizePerString) {
        if(sizePerString < 0){
            this.charPerString = 0;
        }else {
            this.charPerString = sizePerString;
        }
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        if(seed < 0){
            this.seed = 0;
        }else {
            this.seed = seed;
        }
    }

    public ArrayStringGenerator(int length, int charPerString, int seed) {
        if(length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
        this.charPerString = charPerString;
        this.seed = seed;
    }

    public String[] generateArray() {

        Random random = new Random();
        String[] arr = new String[length];
        String temp = "";

        if(seed > 0)
            random.setSeed(seed);

        if(charPerString <= 0){
            String [] empty = new String[0];
            return empty;
        }

        for (int i = 0; i < length; i++) {
            temp = "";
            for(int j = 0; j < charPerString; j++){
                temp = temp + alphabet[random.nextInt(0,26)];
            }
            arr[i] = temp;
        }

        return arr;

    }


}
