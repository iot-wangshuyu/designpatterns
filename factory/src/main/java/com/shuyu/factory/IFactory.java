package com.shuyu.factory;

import com.shuyu.operation.Operation;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:工厂接口
 * @date 2018-11-13 23:52
 **/

public interface IFactory {
    Operation createOperation();
}
