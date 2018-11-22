package com.shuyu.iterator;

import javax.jws.Oneway;
import java.util.ArrayList;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.iterator
 * @description:具体聚集类
 * @date 2018-11-22 22:53
 **/

public class ConcreteAggregate implements Aggregate {

    private ArrayList<Object> arrayList=new ArrayList<>();


    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return arrayList.size();
    }

    public Object getArrayListValue(int id) {
        return this.arrayList.get(id);
    }

    public void addArrayList(String value) {
        this.arrayList.add(value);
    }
}
