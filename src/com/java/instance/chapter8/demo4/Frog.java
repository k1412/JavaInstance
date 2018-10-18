/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Frog
 * Author:   wuyang
 * Date:     2018/10/18 20:09
 * Description: 如果有其他作为垃圾回收一部分的特殊清理动作时，就必须在导出类中覆盖dispose（）方法。当覆盖被继承类的dispose（）方法时，调用基类版本siapose（）方法，否则基类的清理动作就不会发生？
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8.demo4;
import static com.java.instance.userDefinedPrint.Print.*;


class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Creating Characteristic " + s);
    }
    protected void dispose(){
        print("dispose Characteristic " + s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        print("Creating Description " + s);
    }
    protected void dispose(){
        print("disposing Description" + s);
    }
}

class LivingCreature{
    private Characteristic p =
            new Characteristic("is alive");
    private Description t =
            new Description("Basic Living Creature");
    LivingCreature(){
        print("LivingCreature()");
    }
    protected void dispose(){
        print("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic p =
            new Characteristic("has heart");
    private Description t =
            new Description("Animal not Vegetable");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic p =
            new Characteristic("can live in water");
    private Description t =
            new Description("Both water and land");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p =
            new Characteristic("Croaks");
    private Description t =
            new Description("Eats Bugs");
    private Frog(){print("Frog()");}
    private void dispoes(){
        print("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
//        Frog frog = new Frog();
//        print("bye!");
//        frog.dispoes();
        new Frog().dispoes();
    }
}