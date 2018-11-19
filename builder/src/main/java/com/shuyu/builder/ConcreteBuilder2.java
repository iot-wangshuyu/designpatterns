package com.shuyu.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.builder
 * @description:
 * @date 2018-11-19 23:24
 **/
@Slf4j
public class ConcreteBuilder2 implements Builder {
    private Product product=new Product();
    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
