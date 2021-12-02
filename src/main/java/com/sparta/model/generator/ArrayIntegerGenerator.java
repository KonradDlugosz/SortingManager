package com.sparta.model.generator;

import java.util.Random;

public class ArrayIntegerGenerator {
    private int length;
    private int start;
    private int end;
    private long seed;


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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        if(start < 0){
            this.start = 0;
        }else {
            this.start = start;
        }
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        if(end < 0){
            this.end = 0;
        }else {
            this.end = end;
        }
    }

    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        if(seed < 0){
            this.seed = 0;
        }else {
            this.seed = seed;
        }
    }

    public ArrayIntegerGenerator(int length, int start, int end, long seed) {
        if(length < 0){
            this.length = 0;
        }
        else {
            this.length = length;
        }
        this.start = start;
        this.end = end;
        this.seed = seed;
    }

    public Integer[] generateArray() {
        Random random = new Random();
        Integer[] arr = new Integer[length];

        if(seed > 0)
            random.setSeed(seed);

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(start, end);
        }
        return arr;
    }




}
