/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Sandwich
 * Author:   wuyang
 * Date:     2018/10/18 19:45
 * Description: 展示组合、继承以及多态在构建顺序上的作用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8.demo4;
import static com.java.instance.userDefinedPrint.Print.*;

class Meal{
    Meal(){
        print("Meal()");
    }
}
class Bread{
    Bread(){
        print("Bread()");
    }
}
class Cheese{
    Cheese(){
        print("Cheese()");
    }
}
class Lettuce{
    Lettuce(){
        print("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch(){
        print("Lunch()");
    }
}
class PortableLunch extends Lunch{
    PortableLunch(){
        print("PortableLunch()");
    }
}
public class Sandwich extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public Sandwich(){print("Sandwich");}

    public static void main(String[] args) {
        new Sandwich();
    }

}