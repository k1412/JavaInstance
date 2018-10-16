package com.java.instance.chapter8.demo1_shape;

import java.util.Random;

/**
 * ClassName RandomShapeGenerator
 * Description
 * Author wyv
 * Create Time 2018-10-16 21:06
 */
class RandomShapeGenerator {
    private Random random = new Random(4);
    Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }
}
