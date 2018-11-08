package com.shuyu.strategy;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.strategy
 * @description:乘法计算类
 * @date 2018-11-08 16:47
 **/

public class OperationMul implements Strategy{
    @Override
    public double operation(double a, double b) {
        return a-b;
    }
}
