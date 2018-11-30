package com.shuyu.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.bridge
 * @description:实现了 DrawAPI 接口的实体桥接实现类
 * @date 2018-11-29 23:45
 **/
@Slf4j
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        log.info("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
