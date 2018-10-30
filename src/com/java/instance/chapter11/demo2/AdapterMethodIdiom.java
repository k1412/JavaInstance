package com.java.instance.chapter11.demo2;

import static com.java.instance.userDefinedPrint.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName AdapterMethodIdiom
 * Description 现有一个Iterable的类，如果想要添加一种或者多种在foreach语句中使用这个类的方法，应该怎么做？---适配器的设计模式
 * Author wyv
 * Create Time 2018-10-30 10:46
 */
class ReversibleArrayList<T>extends ArrayList<T>{
    ReversibleArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T>reversed(){
        return new Iterable<T>(){
            public Iterator<T> iterator(){
                return new Iterator<T>() {
                    private int index = size() - 1;
                    @Override
                    public boolean hasNext() {
                        return index>-1;
                    }

                    @Override
                    public T next() {
                        return get(index--);
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral =
                new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for(String s : ral){
            printnb(s);
        }
        print();
        for(String s : ral.reversed()){
            printnb(s);
        }
    }

}
