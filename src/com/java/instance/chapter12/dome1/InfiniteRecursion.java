package com.java.instance.chapter12.dome1;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName InfiniteRecursion
 * Description 希望toString()方法打印出对象的内存地址，也许你会考虑使用this关键字：
 * Author wyv
 * Create Time 2018-11-07 19:31
 */
public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main(String[] args){
        List<InfiniteRecursion> v =
                new ArrayList<>();
        for(int i = 0; i< 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
