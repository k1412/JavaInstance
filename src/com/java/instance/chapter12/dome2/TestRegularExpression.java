package com.java.instance.chapter12.dome2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.java.instance.userDefinedPrint.Print.*;
/**
 * ClassName TestRegularExpression
 * Description 测试正则表达式
 * Author wyv
 * Create Time 2018-11-07 21:09
 */
public class TestRegularExpression {
    public static void main(String[] args){
        if(args.length < 2){
            print("Usage:\njava TestRegularExpression " +
                    "CharacterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \""+args[0]+"\"");
        for(String arg : args){
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while(m.find()){
                print("Match \"" + m.group() + "\" at positions" +
                        m.start() + "-"+ (m.end() - 1));
            }
        }
    }
}
