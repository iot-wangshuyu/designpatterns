package com.shuyu.operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:除法
 * @date 2018-11-07 13:42
 **/

public class OperationDiv implements Operation {

    @Override
    public double getResult(double numberA,double numberB) {
        double result=0;
        if (numberB==0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            result=numberA/numberB;
        }
        return result;
    }
}
