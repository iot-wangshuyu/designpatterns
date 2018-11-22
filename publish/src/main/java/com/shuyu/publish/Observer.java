package com.shuyu.publish;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.publish
 * @description:抽象关系者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。这个接口叫更新接口；
 * 抽象观察者一般用一个抽象类或者一个接口实现，更新接口通常包含一个update方法，这个方法叫更新方法。
 * @date 2018-11-20 23:01
 **/

public interface Observer {
    void update();

}
