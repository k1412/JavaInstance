package com.java.instance.chapter9.demo2_filters;

/**
 * ClassName LowPass
 * Description \
 * Author wyv
 * Create Time 2018-10-19 19:52
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input; //Dummy processing
    }
}
