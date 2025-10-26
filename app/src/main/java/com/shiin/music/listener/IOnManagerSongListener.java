package com.shiin.music.listener;

import com.shiin.music.model.Song;

public interface IOnManagerSongListener {
    void onClickUpdateSong(Song song);
    void onClickDeleteSong(Song song);
}
