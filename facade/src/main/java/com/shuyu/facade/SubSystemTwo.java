package com.shuyu.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.facade
 * @description:子系统实现类2
 * @date 2018-11-18 22:48
 **/
@Slf4j
public class SubSystemTwo implements SubSystemInterface{
    @Override
    public void method() {
        log.info("子系统方法2");
    }
}
