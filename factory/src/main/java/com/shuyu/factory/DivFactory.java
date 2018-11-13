package com.shuyu.factory;

import com.shuyu.operation.Operation;
import com.shuyu.operation.OperationDiv;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:除法工厂类
 * @date 2018-11-13 23:57
 **/

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
