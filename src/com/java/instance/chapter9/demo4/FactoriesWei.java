package com.java.instance.chapter9.demo4;
import static com.java.instance.userDefinedPrint.Print.*;
/**
 * ClassName Factroies
 * Description 工厂设计模式
 * Author wyv
 * Create Time 2018-10-20 14:03
 */
interface Service2{
    void method1();
    void method2();
}

class ImplementationWei1 implements Service2{
    ImplementationWei1(){}//Package access
    public void method1(){
        print("Implementation1 method1");
    }
    public void method2(){
        print("Implementation1 method2");
    }
}

class ImplementationWei2 implements Service2{
    ImplementationWei2(){}//Package access
    public void method1(){
        print("Implementation2 method1");
    }
    public void method2(){
        print("Implementation2 method2");
    }
}

public class FactoriesWei {
    public static void serviceConsumer(Service2 fact){
        fact.method1();
        fact.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new ImplementationWei1());
        //Implementations are completely interchangeable
        serviceConsumer(new ImplementationWei2());
    }
}
