package com.shuyu.test;

/**
 * @package:com.shuyu.test
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-04 23:49
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/

public class LogTest {

    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
