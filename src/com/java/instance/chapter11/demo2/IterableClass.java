package com.java.instance.chapter11.demo2;

import static com.java.instance.userDefinedPrint.Print.*;
import java.util.Iterator;

/**
 * ClassName IterableClass
 * Description
 * Author wyv
 * Create Time 2018-10-30 10:28
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s : new IterableClass()){
            printnb(s);
        }
    }
}
