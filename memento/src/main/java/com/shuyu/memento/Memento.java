package com.shuyu.memento;

import lombok.Data;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.memento
 * @description:备忘录，负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录
 * Memento，备忘录有两个接口，Caretaker只能看到备忘录的窄接口，他只能将备忘录传递给其他对象。
 * @date 2018-11-27 21:36
 **/
@Data
public class Memento {
    private String state;
    public Memento(String state){
        this.state=state;
    }
}
