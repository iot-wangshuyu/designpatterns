package com.shuyu.publish;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.publish
 * @description:具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调；
 * @date 2018-11-20 23:19
 **/
@Slf4j

public class ConcreteObserver implements Observer {

    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject,String name) {
        this.concreteSubject=concreteSubject;
        this.name=name;
    }

    @Override
    public void update() {
        observerState=concreteSubject.getSubjectState();
        log.info("观察者的新状态是："+name+"  "+observerState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
