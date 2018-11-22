package com.shuyu.publish;

import lombok.Data;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.publish
 * @description:具体主题或具体通知者，将有关状态存入具体观察者对象，在具体主题的内部状态改变时，
 * 给所有登记过的观察者发出通知
 * @date 2018-11-20 23:14
 **/
@Data
public class ConcreteSubject extends SubjectPub{

    private String subjectState;


}
