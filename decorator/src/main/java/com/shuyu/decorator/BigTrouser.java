package com.shuyu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:具体服饰类-垮裤类
 * @date 2018-11-09 22:12
 **/
@Slf4j
public class BigTrouser extends Finery{

    @Override
    public void Show() {
        log.info("垮裤。。。。");
        super.Show();
    }
}
