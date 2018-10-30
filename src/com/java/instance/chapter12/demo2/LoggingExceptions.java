/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoggingExceptions
 * Author:   wuyang
 * Date:     2018/10/30 17:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter12.demo2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class LoggingExceptions {
    public static void main(String[] args){
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught " + e);
        }try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught " + e);
        }
    }
}