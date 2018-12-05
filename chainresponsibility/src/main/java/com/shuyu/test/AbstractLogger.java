package com.shuyu.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @package:com.shuyu.test
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-04 23:36
 * @version:V1.0
 **/
@Slf4j
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger) {
        this.nextLogger = abstractLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }


    abstract protected void write(String message);

}
