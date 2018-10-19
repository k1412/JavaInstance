package com.java.instance.chapter9.demo3_interfaceprocessor;

/**
 * ClassName StringProcessor
 * Description
 * Author wyv
 * Create Time 2018-10-19 21:37
 */
public class StringProcessor {
    public static void main(String[] args) {
        Apply.process(new StringReverseAdapter(new StringReverse()),"abcdefghijklmn");
    }
}
