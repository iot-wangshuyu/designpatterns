package com.shuyu.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @package:com.shuyu.test
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-04 23:44
 * @version:V1.0
 **/
@Slf4j
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("File::Logger: " + message);
    }
}
