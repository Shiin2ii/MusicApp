package com.shiin.music.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shiin.music.R;
import com.shiin.music.databinding.ItemAdminSongBinding;
import com.shiin.music.listener.IOnManagerSongListener;
import com.shiin.music.model.Song;
import com.shiin.music.utils.GlideUtils;

import java.util.List;

public class AdminSongAdapter extends RecyclerView.Adapter<AdminSongAdapter.AdminSongViewHolder> {

    private final List<Song> mListSongs;
    public final IOnManagerSongListener iOnManagerSongListener;

    public AdminSongAdapter(List<Song> list, IOnManagerSongListener listener) {
        this.mListSongs = list;
        this.iOnManagerSongListener = listener;
    }

    @NonNull
    @Override
    public AdminSongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemAdminSongBinding itemAdminSongBinding = ItemAdminSongBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new AdminSongViewHolder(itemAdminSongBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminSongViewHolder holder, int position) {
        Song song = mListSongs.get(position);
        if (song == null) return;
        GlideUtils.loadUrl(song.getImage(), holder.mItemAdminSongBinding.imgSong);
        holder.mItemAdminSongBinding.tvName.setText(song.getTitle());
        holder.mItemAdminSongBinding.tvArtist.setText(song.getArtist());
        if (song.isFeatured()) {
            holder.mItemAdminSongBinding.tvFeatured.setText(holder.mItemAdminSongBinding.getRoot().getContext().getString(R.string.yes));
        } else {
            holder.mItemAdminSongBinding.tvFeatured.setText(holder.mItemAdminSongBinding.getRoot().getContext().getString(R.string.no));
        }
        if (song.isLatest()) {
            holder.mItemAdminSongBinding.tvLatest.setText(holder.mItemAdminSongBinding.getRoot().getContext().getString(R.string.yes));
        } else {
            holder.mItemAdminSongBinding.tvLatest.setText(holder.mItemAdminSongBinding.getRoot().getContext().getString(R.string.no));
        }

        holder.mItemAdminSongBinding.imgEdit.setOnClickListener(v -> iOnManagerSongListener.onClickUpdateSong(song));
        holder.mItemAdminSongBinding.imgDelete.setOnClickListener(v -> iOnManagerSongListener.onClickDeleteSong(song));
    }

    @Override
    public int getItemCount() {
        return null == mListSongs ? 0 : mListSongs.size();
    }

    public static class AdminSongViewHolder extends RecyclerView.ViewHolder {

        private final ItemAdminSongBinding mItemAdminSongBinding;

        public AdminSongViewHolder(ItemAdminSongBinding itemAdminSongBinding) {
            super(itemAdminSongBinding.getRoot());
            this.mItemAdminSongBinding = itemAdminSongBinding;
        }
    }
}
