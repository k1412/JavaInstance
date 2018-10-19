package com.java.instance.chapter9.demo3_interfaceprocessor;

/**
 * ClassName Processor
 * Description
 * Author wyv
 * Create Time 2018-10-19 20:04
 */
public interface Processor {
    String name();
    Object process(Object input);
}
