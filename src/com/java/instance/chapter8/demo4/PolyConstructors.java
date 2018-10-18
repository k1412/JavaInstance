/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: PolyConstructors
 * Author:   wuyang
 * Date:     2018/10/18 20:51
 * Description: 如果在一个构造器的内部调用正在构造的对象的某个动态绑定方法，会发生什么？
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8.demo4;
import static com.java.instance.userDefinedPrint.Print.*;
import java.util.*;

class Glyph{
    void draw(){
        print("Glyph.draw()");
    }
    Glyph(){
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius  = 1;
    RoundGlyph(int radius){
        this.radius = radius;
        print("RoundGlyph.RoundGlyph().radius = " + radius);
    }
    void draw(){
        print("RoundGlyph.draw().radius = " + radius);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}