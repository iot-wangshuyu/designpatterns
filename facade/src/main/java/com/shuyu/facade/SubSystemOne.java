package com.shuyu.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.facade
 * @description:子系统实现类1
 * @date 2018-11-18 22:47
 **/
@Slf4j
public class SubSystemOne implements SubSystemInterface {
    @Override
    public void method() {
        log.info("子系统方法1");
    }
}
