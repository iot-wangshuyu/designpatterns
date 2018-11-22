package com.shuyu.publish;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.publish
 * @description:主题或抽象通知者，一般用一个抽象类或者一个接口实现，它把所有对观察者的对象的引用
 * 保存在一个聚集里，每个主题都可以有任何数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象
 * @date 2018-11-20 22:57
 **/

public class SubjectPub {

    private List<Observer> observers=new ArrayList<>();
    
    
    
    /**
     * @author:shuyu.wang
     * @description:增加观察者
     * @date: 2018/11/20 23:05
     * @param null : 
     * @return : null
    */
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    
    /**
     * @author:shuyu.wang
     * @description:移除观察者
     * @date: 2018/11/20 23:06
     * @param null : 
     * @return : null
    */
    public void detach(Observer observer){
        observers.remove(observer);
    }
    
    /**
     * @author:shuyu.wang
     * @description:通知
     * @date: 2018/11/20 23:07
     * @param null : 
     * @return : null
    */
    public void notifyA(){
        for (Observer o : observers) {
            o.update();
        }
    }
}
