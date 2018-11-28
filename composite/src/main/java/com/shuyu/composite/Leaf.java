package com.shuyu.composite;

import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Size;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.composite
 * @description:在组合中表示叶子节点对象，叶子节点没有子节点
 * @date 2018-11-28 13:36
 **/
@Slf4j
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        log.error("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        log.error("cannot remove to a leaf");
    }

    @Override
    public void display(int depth) {
        log.info(AppendString.appendChar("-",depth) + name);
    }
}
