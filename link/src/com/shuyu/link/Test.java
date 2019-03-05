package com.shuyu.link;

import java.util.LinkedList;

/**
 * @package:com.shuyu.link
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-03-05 10:50
 * @version:V1.0
 * @NOTICE：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/

public class Test {

    private static Node head=new Node(0);

    public static void addNode(Node node){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }

    public static void main(String[] args){
        Node node=new Node(5);
        addNode(node);

    }
}
