package com.shuyu.strategy;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.strategy
 * @description:
 * @date 2018-11-08 17:10
 **/

public class Context {
    Strategy strategy = null;

    public Context(Strategy strategy ) {
        this.strategy=strategy;
    }

    public double operation(double a,double b){
        return strategy.operation(a, b);
    }

}
