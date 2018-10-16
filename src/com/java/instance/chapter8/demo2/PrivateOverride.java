package com.java.instance.chapter8.demo2;
import static com.java.instance.userDefinedPrint.Print.*;
/**
 * ClassName PrivateOverride
 * Description 多态的缺陷：在不清楚原方法是不是私有方法时，会覆盖私有方法
 * Author wyv
 * Create Time 2018-10-16 21:44
 */
public class PrivateOverride {
    private void f(){print("private f()");}
    public static void main(String[] args){
        PrivateOverride privateOverride = new Derived();
        privateOverride.f();
        //Derived derived = new Anny();
        //derived.f();
    }
}

class Derived extends PrivateOverride{
    public void f(){
        print("public f()");
    }
//}
//class Anny extends Derived{
//    public void f(){
//        print("anny's f()");
//    }
}
