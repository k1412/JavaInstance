/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Music
 * Author:   wuyang
 * Date:     2018/10/17 12:36
 * Description: 面向基类接口是旧方法，在基类方法更新后依旧可以使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter8.demo3_music;
import static com.java.instance.userDefinedPrint.Print.*;
class Instrument{
    void play(Note note){
        print("Instrument.play()" + note);
    }
    String what(){return "Instrument";}
    void adjust(){print("Adjusting Instrument");}
}

class Wind extends Instrument{
    void play(Note note){
        print("Wind.play()" + note);
    }
    String what(){return "Wind";}
    void adjust(){print("Adjusting Wind");}
}

class Percussion extends Instrument{
    void play(Note note){
        print("percussion.play()" + note);
    }
    String what(){return "percussion";}
    void adjust(){print("Adjusting percussion");}
}

class Stringed extends Instrument{
    void play(Note note){
        print("Stringed.play()" + note);
    }
    String what(){return "Stringed";}
    void adjust(){print("Adjusting Stringed");}
}

class Brass extends Wind{
    void play(Note note){
        print("Brass.play()" + note);
    }
    void adjust(){
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind{
    void play(Note note){
        print("Woodwind.play()" + note);
    }
    String what(){
        return "Woodwind";
    }
}



public class Music {

    private static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments){
        for(Instrument i : instruments){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}