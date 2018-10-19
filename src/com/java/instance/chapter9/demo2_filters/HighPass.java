package com.java.instance.chapter9.demo2_filters;

/**
 * ClassName HighPass
 * Description
 * Author wyv
 * Create Time 2018-10-19 19:55
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input; //Dummy processing
    }
}
