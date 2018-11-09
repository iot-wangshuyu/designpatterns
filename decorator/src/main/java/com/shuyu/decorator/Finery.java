package com.shuyu.decorator;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.decorator
 * @description:服饰类
 * @date 2018-11-09 22:06
 **/

public class Finery extends Person{
    protected Person component;
    //装饰方法
    public void Decorate(Person component){
        this.component=component;
    }

    @Override
    public void Show() {
        if (component!=null){
            component.Show();
        }
    }
}
