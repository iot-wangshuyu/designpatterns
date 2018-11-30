package com.shuyu.commadn;

import lombok.extern.slf4j.Slf4j;

/**
 * @package:com.shuyu.commadn
 * @className:
 * @description:请求类
 * @author:Shuyu.Wang
 * @date:2018-11-30 22:41
 * @version:V1.0
 **/
@Slf4j
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        log.info("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        log.info("Stock [ Name: " + name + ",  Quantity:" + quantity +" ]sold ");
    }

}
