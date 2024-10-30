package ru.mirea.dolgov.RickandMorty;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RickAndMortyService {
    @GET("episode")
    Call<Result> getEpisodes();
}

