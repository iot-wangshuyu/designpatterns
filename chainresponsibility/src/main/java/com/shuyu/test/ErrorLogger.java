package com.shuyu.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @package:com.shuyu.test
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-04 23:43
 * @version:V1.0
 **/
@Slf4j
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        log.info("Error Console::Logger: " + message);
    }
}
