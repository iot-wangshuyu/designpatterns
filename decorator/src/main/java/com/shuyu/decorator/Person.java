package com.shuyu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:
 * @date 2018-11-09 22:02
 **/
@Slf4j
public class Person {
    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void Show() {
        log.info("装扮的" + name);
    }
}
