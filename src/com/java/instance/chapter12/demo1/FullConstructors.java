/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FullConstructors
 * Author:   wuyang
 * Date:     2018/10/30 16:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter12.demo1;

class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){super(msg);}
}
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException("Originated in g()");
    }
    public static void main(String[] args){
        try{
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }

}