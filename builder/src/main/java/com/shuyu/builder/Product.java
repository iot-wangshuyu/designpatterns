package com.shuyu.builder;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.builder
 * @description:产品类
 * @date 2018-11-19 23:14
 **/
@Slf4j
public class Product {
    List<String> parts=new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        log.info("产品  创建--");
        for (String part:parts) {
            log.info(part);
        }
    }
}
