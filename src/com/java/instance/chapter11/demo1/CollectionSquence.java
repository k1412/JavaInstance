package com.java.instance.chapter11.demo1;

import com.java.instance.typeinfo.pets.*;
import com.java.instance.chapter11.demo1.InterfaceVsIterator;
import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * ClassName CollectionSquence
 * Description
 * Author wyv
 * Create Time 2018-10-30 8:39
 */
public class CollectionSquence extends AbstractCollection {

    private Pet[] pets = Pets.createArray(8);
    public int size(){
        return pets.length;
    }

    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index = 0;
            public boolean hasNext(){
                return index < pets.length;
            }
            public Pet next(){
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSquence collectionSquence = new CollectionSquence();
        InterfaceVsIterator.display(collectionSquence);
        InterfaceVsIterator.display(collectionSquence.iterator());
    }
}
