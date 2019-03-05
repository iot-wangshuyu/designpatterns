package com.shuyu.doublelink;

/**
 * @package:com.shuyu.doublelink
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-03-05 15:12
 * @version:V1.0
 * @NOTICE：本内容仅限于新疆感知科技有限公司内部传阅,禁止外泄以及用于其他的商业目
 * @ Copyright © 2017-ganinfo. All rights reserved.
 **/

public class Node {

    public int data;
    public Node pre;
    public Node next;


    public Node(int data){
        this.data=data;
    }

    public void displayNode(){
        System.out.println(">>>"+data+" ");
    }


}
