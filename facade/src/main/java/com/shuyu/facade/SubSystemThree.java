package com.shuyu.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.facade
 * @description:子系统实现类3
 * @date 2018-11-18 22:50
 **/
@Slf4j
public class SubSystemThree implements SubSystemInterface{
    @Override
    public void method() {
        log.info("子系统方法3");
    }
}
