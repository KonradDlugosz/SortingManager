package com.sparta.model;

import java.util.Random;

public class ArrayGenerator {
    private int length;
    private int start;
    private int end;
    private long seed;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public ArrayGenerator(int length, int start, int end) {
        this(length,start,end, 0);
    }

    public ArrayGenerator(int length, int start, int end, long seed) {
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

    public int[] generateArray() {
        Random random = new Random();
        int[] arr = new int[length];

        if(seed > 0)
            random.setSeed(seed);

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(start, end);
        }
        return arr;
    }




}
