package com.shuyu.adapter;

/**
 * @author Shuyu.Wang
 * @package:com.shuyu.adapter
 * @description:实现了 MediaPlayer 接口的适配器类
 * @date 2018-11-25 22:54
 **/

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("vlc")){
            advancedMusicPlayer=new VlcPlayer();
        }else if (type.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
         if (audioType.equalsIgnoreCase("vlc")){
             advancedMusicPlayer.playVlc(fileName);
         }else if (audioType.equalsIgnoreCase("mp4")){
             advancedMusicPlayer.playMp4(fileName);
         }
    }
}
