/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: InheritInner
 * Author:   wuyang
 * Date:     2018/10/22 23:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter10.demo4;

class WithInner{
    class Inner{}
}
public class InheritInner extends WithInner.Inner{

    InheritInner(WithInner withInner){
        withInner.super();
    }
    public static void main(String[] args){
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}