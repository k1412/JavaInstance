package com.java.instance.chapter11.demo1;

import com.java.instance.typeinfo.pets.*;

import java.util.Iterator;

/**
 * ClassName NonCollectionSquence
 * Description
 * Author wyv
 * Create Time 2018-10-30 9:14
 */
class PetSquence{
    Pet[] pets = Pets.createArray(8);
}
public class NonCollectionSquence extends PetSquence{

    public Iterator<Pet>iterator(){
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSquence nonCollectionSquence = new NonCollectionSquence();
        InterfaceVsIterator.display(nonCollectionSquence.iterator());
    }
}
