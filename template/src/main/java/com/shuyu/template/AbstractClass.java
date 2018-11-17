package com.shuyu.template;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.template
 * @description:抽象模板
 * @date 2018-11-17 22:56
 **/

public abstract  class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
