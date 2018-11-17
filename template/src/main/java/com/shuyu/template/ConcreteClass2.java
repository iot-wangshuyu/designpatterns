package com.shuyu.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.template
 * @description:
 * @date 2018-11-17 23:03
 **/
@Slf4j
public class ConcreteClass2 extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        log.info("类2方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        log.info("类2方法2实现");
    }
}
