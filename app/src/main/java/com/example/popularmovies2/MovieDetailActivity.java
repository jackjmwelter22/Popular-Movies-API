package com.example.popularmovies2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieDetailActivity extends AppCompatActivity{
    private String id;
    private static Context detailContext;
    private ImageView background;
    private TextView title;
    private TextView tagline;
    private TextView releaseDate;
    private TextView overview;
    private TextView runTime;
    private TextView voteAvg;
    private TextView popularity;
    private ProgressBar pb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        pb = (ProgressBar) findViewById(R.id.pbLoading);
        pb.setVisibility(ProgressBar.VISIBLE);

        id = getIntent().getStringExtra("id");

        background = (ImageView) findViewById(R.id.backdropImageView);
        title = (TextView) findViewById(R.id.titleTextView);
        tagline = (TextView) findViewById(R.id.taglineTextView);
        releaseDate = (TextView) findViewById(R.id.releaseDateTextView);
        overview = (TextView) findViewById(R.id.overviewTextView);
        runTime = (TextView) findViewById(R.id.runtimeTextView);
        voteAvg = (TextView) findViewById(R.id.voteAvgTextView);
        popularity = (TextView) findViewById(R.id.popularityTextView);

        final Call<MovieResponse> call = MovieSingleton.getInstance().getMovieApiService().GetDetails(id);

        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                Picasso.with(detailContext).load("http://image.tmdb.org/t/p/w342/"+response.body().getBackdropPath()).into(background);
                title.setText(response.body().getTitle());
                tagline.setText("\"" + response.body().getTagline() + "\"");
                String pattern = "MM/dd/yyyy";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                releaseDate.setText("\nRelease Date: " + format.format(response.body().getReleaseDate()));
                overview.setText("\nOverview:\n" + response.body().getOverview());
                runTime.setText("\nRuntime: " + Integer.valueOf(response.body().getRuntime())/60 + "h " + Integer.valueOf(response.body().getRuntime())%60 + "m");
                voteAvg.setText("Rating: "+String.valueOf(response.body().getVoteAverage())+"/10");
                popularity.setText(String.valueOf("Popularity: "+response.body().getPopularity()));
                pb.setVisibility(ProgressBar.INVISIBLE);
            }
            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
            }
        });

    }
}
