package com.shuyu.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.composite
 * @description:定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作，比如增加节点和移除节点
 * @date 2018-11-28 13:40
 **/
@Slf4j
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        log.info(AppendString.appendChar("-",depth)+ name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }
}
