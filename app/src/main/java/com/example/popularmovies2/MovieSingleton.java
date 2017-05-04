package com.example.popularmovies2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.text.DateFormat;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class MovieSingleton {
    private static final MovieSingleton ourInstance = new MovieSingleton();
    private MovieApiService movieApiService;

    public static MovieSingleton getInstance() {
        return ourInstance;
    }

    private MovieSingleton() {
        Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL, DateFormat.FULL).create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request request = chain.request();
                            HttpUrl url = request.url().newBuilder().addQueryParameter("api_key", "d3afd7e389438ee3f26ffbf85bd0de43").build();
                            request = request.newBuilder().url(url).build();
                            return chain.proceed(request);
                        }
                    }).build())
                .build();
        movieApiService = retrofit.create(MovieApiService.class);
    }
    public MovieApiService getMovieApiService(){
        return movieApiService;
    }
}
