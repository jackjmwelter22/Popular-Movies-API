package com.example.popularmovies2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class MovieAdapter extends RecyclerView.Adapter<PosterViewHolder> {
    private int pageN;
    private List<MovieResponse.Results> movieDataList = new ArrayList<>();
    private LayoutInflater inflater;
    private Context context;

    public MovieAdapter(Context context2) {
        this.context = context2;
        this.inflater = LayoutInflater.from(context2);
    }
    @Override
    public PosterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_content,parent,false);
        final PosterViewHolder viewHolder = new PosterViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(PosterViewHolder holder, int position) {
        final MovieResponse.Results movieList = movieDataList.get(position);
        Picasso.with(context).load("http://image.tmdb.org/t/p/w185/" + movieList.getPosterPath()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context,MovieDetailActivity.class);
                intent.putExtra("id",String.valueOf(movieList.getId()));
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return (movieDataList == null) ? 0 : movieDataList.size();
    }
    public void setData(MovieResponse movieResponse){
        this.pageN = movieResponse.getPage();
        this.movieDataList.addAll(movieResponse.getResults());
        notifyDataSetChanged();
    }
    public int getPageN(){
        return pageN;
    }
}
