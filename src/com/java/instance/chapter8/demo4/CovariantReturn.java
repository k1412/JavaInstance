/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CovariantReturn
 * Author:   wuyang
 * Date:     2018/10/18 21:30
 * Description: 协变返回值
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8.demo4;

class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}
class Mill{
    Grain process(){
        return new Grain();
    }
}
class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g  = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}