package com.shuyu.factory;

import com.shuyu.operation.*;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.factory
 * @description:工程类
 * @date 2018-11-07 14:12
 **/

public class OpreationFactory {

    public static Operation createOperate(String operate){
        Operation operation=null;
        switch (operate){
            case "+":
                operation=new OperationAdd();
                break;
            case "-":
                operation=new OperationSub();
                break;
            case "*":
                operation=new OperationMul();
                break;
            case "/":
                operation=new OperationDiv();
                break;

        }
        return operation;
    }
}
