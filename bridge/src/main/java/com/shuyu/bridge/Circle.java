package com.shuyu.bridge;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.bridge
 * @description:创建实现了 Shape 接口的实体类
 * @date 2018-11-29 23:49
 **/

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
