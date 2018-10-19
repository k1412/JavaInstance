/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Apply
 * Author:   wuyang
 * Date:     2018/10/18 23:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter9.demo1;

import com.java.instance.chapter9.demo3_interfaceprocessor.Processor;

import static com.java.instance.userDefinedPrint.Print.*;
import java.lang.reflect.Array;
import java.util.Arrays;

class ProcessorOldAdapter implements Processor{

    ProcessorOld processorOld = new ProcessorOld();
    String s = new String();
    public String name(){
        return processorOld.name();
    }
    ProcessorOldAdapter( ProcessorOld processorOld){
        this.processorOld = processorOld;
        this.s = s;
    }
    public Object process(Object input){return processorOld.process(input);}
}

class ProcessorOld {
    public String name(){
        return getClass().getSimpleName();
    }
     Object process(Object input){return input;}
}

class Upcase extends ProcessorOld{
     String process(Object input){
        return ((String)input).toUpperCase();//变成大写字母，，
    }
}

class Splitter extends ProcessorOld{
     String process(Object input){
        return Arrays.toString(((String)input).split(" "));//用“ ”进行分词处理，并把分词结果存到一个数组里面
    }
}

class Downcase extends ProcessorOld{
     String process(Object input){
        return ((String)input).toLowerCase();
    }
}

public class Apply {
    public static void processe(Processor processor, Object object){
        print("Using Processor " + processor.name());//why?
        print(processor.process(object));//打印的其实是方法所返回的值
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args){
          processe(new ProcessorOldAdapter(new Upcase()),s);
          processe(new ProcessorOldAdapter(new Downcase()),s);
          processe(new ProcessorOldAdapter(new Splitter()),s);

//        new Upcase().process(s);//只是创建一个实例化对象并没有输出的操作，也不会进行输出操作；
//        new Downcase().process(s);
//        new Splitter().process(s);

        //ProcessorOldAdapter(new Upcase());

    }

}