package com.example.popularmovies2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        movieAdapter = new MovieAdapter(this);
        recyclerView.setAdapter(movieAdapter);
        getData(1);
        recyclerView.addOnScrollListener(new EndlessScrollListener(gridLayoutManager){
            @Override
            public void onLoadMore() {
            getData(movieAdapter.getPageN()+1);
            }
        });
    }
    public void getData(int pageN){
        Call<MovieResponse> call = MovieSingleton.getInstance().getMovieApiService().GetPopular(pageN);

        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                movieAdapter.setData(response.body());
            }
            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
            }
        });
    }
}
