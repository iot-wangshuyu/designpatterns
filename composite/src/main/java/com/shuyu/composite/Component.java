package com.shuyu.composite;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.composite
 * @description:组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为，声明一个接口用于访问和管理Component的子部件
 * @date 2018-11-28 13:27
 **/

public abstract class Component {
     protected String name;
     public Component(String name){
         this.name=name;
     }

     abstract void add(Component component);
     abstract void remove(Component component);
     abstract void display(int depth);

}
