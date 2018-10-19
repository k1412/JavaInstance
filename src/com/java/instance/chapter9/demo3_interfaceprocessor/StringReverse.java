package com.java.instance.chapter9.demo3_interfaceprocessor;

/**
 * ClassName StringTest
 * Description 练习：创建一个类，它有一个方法用于接收一个String类型的参数，生成的结果可以将参数中每对字符串进行调换
 * Author wyv
 * Create Time 2018-10-19 21:30
 */
class StringReverseAdapter implements Processor{

    StringReverse stringReverse = new StringReverse();
    StringReverseAdapter(StringReverse stringReverse){
        this.stringReverse  = stringReverse;
    }
    public String name(){
        return null;
    }
    public Object process(Object string) {
        return stringReverse.processor((String)string);
    }
}

public class StringReverse {
    String processor(String string){
        return new StringBuffer(string).reverse().toString();
    }
}
