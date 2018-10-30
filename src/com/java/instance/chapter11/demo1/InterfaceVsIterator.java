package com.java.instance.chapter11.demo1;

import com.java.instance.typeinfo.pets.Pet;
import static com.java.instance.userDefinedPrint.Print.*;

import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName InterfaceVsIterator
 * Description
 * Author wyv
 * Create Time 2018-10-30 8:59
 */
public class InterfaceVsIterator {

    public static void display(Collection<Pet> pets){
        for(Pet p : pets){
            printnb(p.id() + " : " + p );
        }
        print();
    }

    public static void display(Iterator<Pet> iterator){
        while(iterator.hasNext()){
            Pet p = iterator.next();
            printnb(p.id() + " : " + p );
        }
        print();
    }
}
