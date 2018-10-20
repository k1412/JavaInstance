package com.java.instance.chapter10.demo2;
import static com.java.instance.userDefinedPrint.Print.*;

/**
 * ClassName Factories
 * Description
 * Author wyv
 * Create Time 2018-10-20 20:03
 */

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    Implementation1(){}//Package access
    public void method1(){
        print("Implementation1 method1");
    }
    public void method2(){
        print("Implementation1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory(){
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}
class Implementation2 implements Service{
    Implementation2(){}//Package access
    public void method1(){
        print("Implementation2 method1");
    }
    public void method2(){
        print("Implementation2 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        //Implementations are completely interchangeable
        serviceConsumer(Implementation1.factory);
    }
}
