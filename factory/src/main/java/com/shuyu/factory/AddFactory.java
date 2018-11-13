package com.shuyu.factory;

import com.shuyu.operation.Operation;
import com.shuyu.operation.OperationAdd;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:加法工厂
 * @date 2018-11-13 23:53
 **/

public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
