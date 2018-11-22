package com.shuyu.singleton;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.singleton
 * @description:单列模式，懒汉式，线程不安全
 * @date 2018-11-22 21:42
 **/

public class Singleton1 {

    private static Singleton1 singleton1;
    //防止外界使用new 创建次类实例
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if (singleton1==null){
            singleton1=new Singleton1();
        }
        return singleton1;
    }



}
