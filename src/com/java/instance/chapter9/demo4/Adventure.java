/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Adventure
 * Author:   wuyang
 * Date:     2018/10/20 10:47
 * Description: Multiple interfaces
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter9.demo4;
import static com.java.instance.userDefinedPrint.Print.*;
interface CanFight{
    void fight();
    void eat();
}
interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){
        print("i can fight");
    }
}
class Hero extends ActionCharacter
        implements CanFight,CanSwim,CanFly{
    public void swim(){
        print("hero can swim");
    }
    public void fly(){
        print("hero can fly");
    }
    public void eat(){
        print("hero will eat()");
    }
    public void fight(){
        print("hero can fight");
    }
}
public class Adventure {
    public static void t(CanFly x){x.fly();}
    public static void u(CanSwim x){x.swim();}
    public static void v(CanFight x){x.fight();}
    public static void o(CanFight x){x.eat();}
    public static void w(ActionCharacter x){x.fight();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        o(hero);
        w(hero);
    }
}