package com.java.instance.chapter10.demo1;
import com.java.instance.chapter10.demo1.*;

/**
 * ClassName Parcel5
 * Description
 * Author wyv
 * Create Time 2018-10-20 18:45
 */

public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination {
            private String lable;
            private PDestination(String whereTo){
                lable = whereTo;
            }
            public String readLable(){
                return lable;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
