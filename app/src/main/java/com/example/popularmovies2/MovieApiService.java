package com.example.popularmovies2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieApiService {
    @GET("movie/popular")
    Call<MovieResponse> GetPopular(@Query("page") int pageN);
    @GET("movie/now_playing")
    Call<MovieResponse> GetNowPlaying(@Query("page") int pageN);
    @GET("movie/{id}")
    Call<MovieResponse> GetDetails(@Path("id") String id);

}
