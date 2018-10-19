package com.java.instance.chapter9.demo3_interfaceprocessor;

import com.java.instance.chapter9.demo2_filters.Filter;
import com.java.instance.chapter9.demo2_filters.HighPass;
import com.java.instance.chapter9.demo2_filters.LowPass;
import com.java.instance.chapter9.demo2_filters.BandPass;
import com.java.instance.chapter9.demo2_filters.Waveform;

/**
 * ClassName FilterProcessor
 * Description
 * Author wyv
 * Create Time 2018-10-19 20:09
 */


class FilterAdapter implements Processor{//接口适配器
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){return filter.name();}

    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }
}
public class FilterProcessor {
    public static void main(String[] args){
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new HighPass(2)),waveform);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveform);
    }
}
