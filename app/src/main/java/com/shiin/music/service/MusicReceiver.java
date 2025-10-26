package com.shiin.music.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.shiin.music.constant.Constant;
import com.shiin.music.constant.GlobalFunction;

public class MusicReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int action = intent.getExtras().getInt(Constant.MUSIC_ACTION);
        GlobalFunction.startMusicService(context, action, MusicService.mSongPosition);
    }
}