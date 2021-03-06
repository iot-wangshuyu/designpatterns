package com.shuyu.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:具体服饰类-皮鞋
 * @date 2018-11-09 22:19
 **/
@Slf4j
public class LeatherShoes extends Finery {
    @Override
    public void Show() {
        log.info("皮鞋");
        super.Show();
    }
}
