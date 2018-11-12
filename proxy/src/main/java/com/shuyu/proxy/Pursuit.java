package com.shuyu.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.proxy
 * @description:代理类锁代理的真实实体
 * @date 2018-11-12 22:20
 **/
@Slf4j
public class Pursuit implements IGiveGift {
    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolis() {
        log.info(schoolGirl.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        log.info(schoolGirl.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        log.info(schoolGirl.getName() + "送你巧克力");
    }
}
