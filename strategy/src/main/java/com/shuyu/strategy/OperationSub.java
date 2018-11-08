package com.shuyu.strategy;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.strategy
 * @description:减法类
 * @date 2018-11-08 16:46
 **/

public class OperationSub implements Strategy{
    @Override
    public double operation(double a, double b) {
        return a-b;
    }
}
