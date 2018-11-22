package com.shuyu.iterator;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.iterator
 * @description:迭代器接口类
 * @date 2018-11-22 22:46
 **/

public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object getCurrentItem();


}
