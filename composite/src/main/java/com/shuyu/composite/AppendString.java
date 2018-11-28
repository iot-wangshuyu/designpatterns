package com.shuyu.composite;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.composite
 * @description:拼接字符串-
 * @date 2018-11-28 13:58
 **/

public class AppendString {
    public static String appendChar(String chars,int depth){
        if (depth<1){
            return null;
        }
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<depth;i++){
            stringBuffer.append(chars);
        }
        return  stringBuffer.toString();
    }
}
