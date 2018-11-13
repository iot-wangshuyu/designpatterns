package com.shuyu.factory;

import com.shuyu.operation.Operation;
import com.shuyu.operation.OperationSub;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:减法工厂类
 * @date 2018-11-13 23:55
 **/

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
