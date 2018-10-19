package com.java.instance.chapter9.demo2_filters;

import java.util.SplittableRandom;

/**
 * ClassName Waveform
 * Description
 * Author wyv
 * Create Time 2018-10-19 19:45
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform" + id;
    }
}

