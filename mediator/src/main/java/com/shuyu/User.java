package com.shuyu;

import lombok.Data;

/**
 * @package:com.shuyu
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-05 23:46
 * @version:V1.0
 **/
@Data
public class User {
    private String name;

    public User(String name){
        this.name=name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
