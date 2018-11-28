package com.shuyu.memento;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.memento
 * @description:发起人，负责创建一个备忘录，用以记录当前时刻他的内部状态，并可使用备忘录恢复内部状态。
 * 可根据需要决定Memento存储Originator的哪些内部状态
 * @date 2018-11-27 21:33
 **/
@Slf4j
@Data
public class Originator {

    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state=memento.getState();
    }

    public void show(){
        log.info("State="+state);
    }

}
