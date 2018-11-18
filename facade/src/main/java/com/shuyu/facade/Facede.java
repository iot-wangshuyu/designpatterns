package com.shuyu.facade;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.facade
 * @description:外观类
 * @date 2018-11-18 22:51
 **/

public class Facede {
    private SubSystemInterface subSystemOne;
    private SubSystemInterface subSystemTwo;
    private SubSystemInterface subSystemThree;
    public Facede(){
        subSystemOne=new SubSystemOne();
        subSystemTwo=new SubSystemTwo();
        subSystemThree=new SubSystemThree();
    }
    
    
    /**
     * @author:shuyu.wang
     * @description:方法1
     * @date: 2018/11/18 23:00
     * @param: 
    */
    public void methodA(){
        subSystemOne.method();
        subSystemTwo.method();
    }
    
    
    /**
     * @author:shuyu.wang
     * @description:方法2
     * @date: 2018/11/18 23:00
     * @param: 
    */
    public void methodB(){
        subSystemTwo.method();
        subSystemThree.method();
    }
}
