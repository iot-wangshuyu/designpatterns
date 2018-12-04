package com.shuyu.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.adapter
 * @description:
 * @date 2018-11-25 22:52
 **/
@Slf4j
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        log.info("Playing mp4 file. Name: "+ fileName);
    }
}
