package com.shuyu.operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:加法类
 * @date 2018-11-07 13:32
 **/

public class OperationAdd  extends Operation{
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()+getNumberB();
        return result;
    }
}
