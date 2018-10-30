package com.java.instance.chapter11.demo2;

import static com.java.instance.userDefinedPrint.Print.*;

import java.util.*;

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

    public Iterable<String>reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int index = words.length-1;
                    @Override
                    public boolean hasNext() {
                        return index>-1;
                    }
                    @Override
                    public String next() {
                        return words[index--];
                    }
                    public void remove(){}
                };
            }
        };
    }

    //重要の扩展
    public Iterable<String>randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffledString =
                        new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffledString,new Random(41));
                return shuffledString.iterator();
            }
        };
    }

    public static void main(String[] args) {
        IterableClass iterableClass = new IterableClass();
        for(String s : iterableClass){
            printnb(s);
        }
        print();
        for(String s : iterableClass.reversed()){
            printnb(s);
        }
        print();
        for(String s : iterableClass.randomized()){
            printnb(s);
        }
    }
}
