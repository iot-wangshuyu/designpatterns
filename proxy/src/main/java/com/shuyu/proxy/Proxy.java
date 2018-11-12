package com.shuyu.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.proxy
 * @description:代理类
 * @date 2018-11-12 22:25
 **/
@Slf4j
public class Proxy implements IGiveGift {
    Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolis() {
        pursuit.giveDolis();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
