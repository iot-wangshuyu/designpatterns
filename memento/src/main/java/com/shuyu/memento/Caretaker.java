package com.shuyu.memento;

import lombok.Data;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.memento
 * @description:管理者，负责变成号备忘录Memento,不能对备忘录的内容进行操作或检查
 * @date 2018-11-28 12:43
 **/
@Data
public class Caretaker {
    private Memento memento;
}
