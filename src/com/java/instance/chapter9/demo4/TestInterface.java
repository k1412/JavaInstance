package com.java.instance.chapter9.demo4;

/**
 * ClassName TestInterface
 * Description
 * Author wyv
 * Create Time 2018-10-20 12:52
 */

interface Interface1{
    void f1();
    void f2();
}
interface Interface2{
    void f3();
    void f4();
}
interface Interface3{
    void f5();
    void f6();
}

interface Interface4 extends Interface1,Interface2,Interface3{
    void f7();
}

class Test{
    void f8(){
        System.out.println("Test.f8()");
    }
}


public class TestInterface extends Test implements Interface4{
    @Override
    public void f7() {
        System.out.println("Test.f7()");
    }

    @Override
    public void f1() {
        System.out.println("Test.f1()");
    }

    @Override
    public void f2() {
        System.out.println("Test.f2()");
    }

    @Override
    public void f3() {
        System.out.println("Test.f3()");
    }

    @Override
    public void f4() {
        System.out.println("Test.f4()");
    }

    @Override
    public void f5() {
        System.out.println("Test.f5()");
    }

    @Override
    public void f6() {
        System.out.println("Test.f6()");
    }

    public static void a(Interface1 interface1){
        interface1.f1();
    }
    public static void b(Interface2 interface2){
        interface2.f3();
    }
    public static void c(Interface3 interface3){
        interface3.f5();
    }
    public static void d(Interface4 interface4){
        interface4.f7();
        interface4.f2();
        interface4.f4();
        interface4.f6();
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        a(testInterface);
        b(testInterface);
        c(testInterface);
        d(testInterface);
    }
}
