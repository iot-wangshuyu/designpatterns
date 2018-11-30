package com.shuyu.bridge;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.bridge
 * @description:使用 DrawAPI 接口创建抽象类 Shape
 * @date 2018-11-29 23:48
 **/

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
