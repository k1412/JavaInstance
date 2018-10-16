package com.java.instance.chapter8.demo1_shape;

/**
 * ClassName Demo1
 * Description 练习使用继承和向上转型---转机
 * Author wyv
 * Create Time 2018-10-16 20:29
 */
public class Shapes {
    private static RandomShapeGenerator shapeGenerator =
            new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[9];

        for(int i = 0; i < s.length; i++){
            s[i] = shapeGenerator.next();
        }

        for(Shape shape : s)
            shape.draw();
    }

}
