package com.atf00.cs125movieproject.API;

import com.atf00.cs125movieproject.model.moviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    @GET("movie/popular")
    Call<moviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<moviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
