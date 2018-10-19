package com.java.instance.chapter9.demo2_filters;

/**
 * ClassName BandPass
 * Description
 * Author wyv
 * Create Time 2018-10-19 19:58
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input){return input;}
}
