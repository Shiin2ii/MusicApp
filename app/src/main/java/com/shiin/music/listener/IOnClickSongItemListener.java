package com.shiin.music.listener;

import com.shiin.music.model.Song;

public interface IOnClickSongItemListener {
    void onClickItemSong(Song song);
    void onClickFavoriteSong(Song song, boolean favorite);
}
