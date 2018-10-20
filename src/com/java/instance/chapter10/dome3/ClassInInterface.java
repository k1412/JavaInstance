package com.java.instance.chapter10.dome3;

/**
 * ClassName ClassInInterface
 * Description
 * Author wyv
 * Create Time 2018-10-20 21:38
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy(){
            System.out.println("Howdy1");
        }
        public static void main(String[] args){
            new Test().howdy();
        }
    }
}
