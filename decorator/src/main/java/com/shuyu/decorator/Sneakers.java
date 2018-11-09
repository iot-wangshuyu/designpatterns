package com.shuyu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:具体服饰类-球鞋
 * @date 2018-11-09 22:14
 **/
@Slf4j
public class Sneakers extends Finery{
    @Override
    public void Show() {
        log.info("球鞋");
        super.Show();
    }
}