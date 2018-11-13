package com.shuyu.operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:减法类
 * @date 2018-11-07 13:35
 **/

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()-getNumberB();
        return result;
    }
}
