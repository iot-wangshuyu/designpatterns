package com.shuyu.singleton;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.singleton
 * @description:懒汉式，采用双锁机制，安全且在多线程情况下能保持高性能
 * @date 2018-11-22 21:57
 **/

public class Singleton2 {

    private volatile static Singleton2 singleton2;

    private Singleton2(){

    }

    private static Singleton2 getInstance(){
        if (singleton2==null){
            synchronized (Singleton2.class){
                if (singleton2==null){
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
