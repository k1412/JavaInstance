package com.java.instance.chapter9.demo3_interfaceprocessor;
import static com.java.instance.userDefinedPrint.Print.*;
/**
 * ClassName Apply
 * Description
 * Author wyv
 * Create Time 2018-10-19 20:06
 */
public class Apply {
    public static void process(Processor p, Object s){
       print("Using Processor " + p.name());
       print(p.process(s));
    }
}
