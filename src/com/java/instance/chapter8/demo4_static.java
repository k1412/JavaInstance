/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: demo4_static
 * Author:   wuyang
 * Date:     2018/10/17 16:38
 * Description: 如果一个方法是静态的，它的行为就不具有多态性
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8;
import static com.java.instance.userDefinedPrint.Print.*;

class StaticSuper{
    public static String staticGet(){//创建一个静态的、可以直接打印的方法
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}
public class demo4_static {
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();//Upcast
        print(sup.dynamicGet());
        print(sup.staticGet());
    }

}