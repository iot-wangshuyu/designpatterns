package com.shuyu.strategy;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.strategy
 * @description:策略切换结合简单工厂模式实现
 * @date 2018-11-08 17:10
 **/

public class Context {
    Strategy strategy = null;

    public Context(String type) {
        switch (type) {
            case "add":
                strategy = new OperationAdd();
                break;
            case "sub":
                strategy = new OperationSub();
                break;
            case "mul":
                strategy = new OperationSub();
                break;
        }
    }

    public double operation(double a,double b){
        return strategy.operation(a, b);
    }

}
