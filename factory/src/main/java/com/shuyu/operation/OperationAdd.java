package com.shuyu.operation;

import lombok.Data;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:加法类
 * @date 2018-11-07 13:32
 **/
public class OperationAdd  implements Operation{
    @Override
    public double getResult(double numberA,double numberB) {
        double result=0;
        result=numberA+numberB;
        return result;
    }
}
