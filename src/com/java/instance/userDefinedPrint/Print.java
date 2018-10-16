package com.java.instance.userDefinedPrint;

/**
 * ClassName Print
 * Description 自定义简化输出
 * Author wyv
 * Create Time 2018-10-16 20:46
 */
public class Print {
    public static void print(){
        System.out.println();
    }
    public static void print(Object object){
        System.out.println(object);
    }
    public static void printnb(Object obj){
        System.out.print(obj + " ");
    }
    public static void printnb(){
        System.out.print(" ");
    }
}
