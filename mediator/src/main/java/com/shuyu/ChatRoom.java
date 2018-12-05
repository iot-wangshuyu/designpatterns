package com.shuyu;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @package:com.shuyu
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2018-12-05 23:45
 * @version:V1.0
 **/
@Slf4j
public class ChatRoom {

    public static void showMessage(User user, String message) {
        log.info(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
