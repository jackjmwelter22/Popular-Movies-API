package com.example.popularmovies2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class PosterViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;

    public PosterViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.posterImageView);
    }
}
