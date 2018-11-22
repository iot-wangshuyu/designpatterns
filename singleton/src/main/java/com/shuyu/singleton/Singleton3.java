package com.shuyu.singleton;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.singleton
 * @description:饿汉式,线程安全，没有加锁，效率高，类加载时初始化，浪费内存
 * @date 2018-11-22 22:02
 **/

public class Singleton3 {
    private static Singleton3 singleton3=new Singleton3();

    private Singleton3(){

    }

    private static Singleton3 getInstance(){
        return singleton3;
    }
}
