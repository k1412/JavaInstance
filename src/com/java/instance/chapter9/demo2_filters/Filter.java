package com.java.instance.chapter9.demo2_filters;

/**
 * ClassName Filter
 * Description
 * Author wyv
 * Create Time 2018-10-19 19:50
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){return input;}
}
