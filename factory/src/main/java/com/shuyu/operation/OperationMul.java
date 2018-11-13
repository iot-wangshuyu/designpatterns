package com.shuyu.operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:乘法
 * @date 2018-11-07 13:39
 **/

public class OperationMul implements Operation{

    @Override
    public double getResult(double numberA,double numberB) {
        double result=0;
        result=numberA*numberB;
        return result;
    }
}
