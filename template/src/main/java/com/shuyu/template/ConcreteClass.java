package com.shuyu.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.template
 * @description:实现类
 * @date 2018-11-17 22:59
 **/
@Slf4j
public class ConcreteClass extends AbstractClass {
    @Override
    public void primitiveOperation1() {
          log.info("方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        log.info("方法2实现");

    }
}
