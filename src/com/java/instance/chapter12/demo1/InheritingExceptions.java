/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: InheritingExceptions
 * Author:   wuyang
 * Date:     2018/10/30 16:43
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter12.demo1;

class SimpleException extends Exception{}

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args){
        InheritingExceptions sed = new InheritingExceptions();
        try{
            sed.f();
        }catch (Exception e){
            System.out.println("Caught it!");
        }
    }

}