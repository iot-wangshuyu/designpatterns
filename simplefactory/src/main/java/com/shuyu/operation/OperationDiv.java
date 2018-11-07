package com.shuyu.operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.operation
 * @description:除法
 * @date 2018-11-07 13:42
 **/

public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result=0;
        if (getNumberB()==0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            result=getNumberA()/getNumberB();
        }
        return result;
    }
}
