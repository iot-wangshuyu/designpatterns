package com.shuyu.strategy;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.strategy
 * @description:加法实现类
 * @date 2018-11-08 16:44
 **/

public class OperationAdd implements Strategy{
    @Override
    public double operation(double a, double b) {
        return a+b;
    }
}
