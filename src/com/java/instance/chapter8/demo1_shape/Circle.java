package com.java.instance.chapter8.demo1_shape;
//import com.java.instance.chapter8.demo1_shape.*;
import com.java.instance.userDefinedPrint.Print.*;

import static com.java.instance.userDefinedPrint.Print.*;

/**
 * ClassName Circle
 * Description
 * Author wyv
 * Create Time 2018-10-16 20:43
 */
public class Circle extends Shape{
    public void draw(){
        print("Circle.draw()");
    }
    public void erase(){
        print("Circle.erase()");
    }
}

