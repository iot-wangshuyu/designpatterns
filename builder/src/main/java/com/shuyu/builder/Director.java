package com.shuyu.builder;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.builder
 * @description:指挥者类
 * @date 2018-11-19 23:26
 **/

public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
