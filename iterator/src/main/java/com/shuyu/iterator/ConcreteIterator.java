package com.shuyu.iterator;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.iterator
 * @description:具体迭代器类
 * @date 2018-11-22 22:50
 **/

public class ConcreteIterator implements Iterator{

    private ConcreteAggregate concreteAggregate;

    private int current=0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate=concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.getArrayListValue(0);
    }

    @Override
    public Object next() {
        Object object=null;
        current++;
        if (current<concreteAggregate.count()){
            object=concreteAggregate.getArrayListValue(current);
        }
        return object;
    }

    @Override
    public boolean isDone() {
        return current>=concreteAggregate.count()?true:false;
    }

    @Override
    public Object getCurrentItem() {
        return concreteAggregate.getArrayListValue(current);
    }
}
