package com.shuyu.doublelink;

/**
 * @package:com.shuyu.doublelink
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-03-05 16:07
 * @version:V1.0
 * @NOTICE：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/

public class Link {
    public static Node first;

    public static void addHead(int data) {
        Node temp = new Node(data);
        if (first != null) {
            first.pre = temp;

        }
        temp.next = first;
        first = temp;

    }


    public static void getHead() {
        if (first == null) {
            System.out.println("链表为空");
        }
        System.out.println(first.data);
    }


    public static void getLast() {
        if (first == null) {
            System.out.println("链表为空");
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
            temp.displayNode();
        }
        System.out.println(temp.data);
    }

}
