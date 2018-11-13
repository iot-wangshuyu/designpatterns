package com.shuyu.factory;

import com.shuyu.operation.Operation;
import com.shuyu.operation.OperationMul;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:乘法工厂
 * @date 2018-11-13 23:56
 **/

public class MulFactoty implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
