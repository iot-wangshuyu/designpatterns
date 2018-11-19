package com.shuyu.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.builder
 * @description:具体建造者类
 * @date 2018-11-19 23:21
 **/
@Slf4j
public class ConcreteBuilder1 implements Builder {

    private Product product=new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
