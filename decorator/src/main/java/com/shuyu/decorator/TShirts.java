package com.shuyu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:具体服饰类-T恤类
 * @date 2018-11-09 22:10
 **/
@Slf4j
public class TShirts extends Finery {
    @Override
    public void Show() {
        log.info("大T恤");
        super.Show();
    }
}
