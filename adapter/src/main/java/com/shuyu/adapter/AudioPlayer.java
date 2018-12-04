package com.shuyu.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.adapter
 * @description: 实现了 MediaPlayer 接口的实体类
 * @date 2018-11-25 23:12
 **/
@Slf4j
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
//播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            log.info("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            log.info("Invalid media. " + audioType + " format not supported");
        }
    }
}
