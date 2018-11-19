package com.shuyu.builder;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.builder
 * @description:抽象建造者类
 * @date 2018-11-19 23:19
 **/

public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
