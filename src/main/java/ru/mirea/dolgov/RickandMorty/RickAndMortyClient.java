package ru.mirea.dolgov.RickandMorty;

import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RickAndMortyClient {
    private static final String BASE_URL = "https://rickandmortyapi.com/api/";

    private final RickAndMortyService rickAndMortyService;

    public RickAndMortyClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        rickAndMortyService = retrofit.create(RickAndMortyService.class);
    }

    public void findEpisodeWithMaxCharacters() throws IOException {
        Call<Result> call = rickAndMortyService.getEpisodes();
        Response<Result> response = call.execute();

        if (response.isSuccessful() && response.body() != null) {
            Result result = response.body();


            Optional<Episode> maxEpisode = result.getEpisodes().stream()
                    .max(Comparator.comparingInt(ep -> ep.getCharacters().size()));

            maxEpisode.ifPresent(ep -> System.out.println("Episode with max characters: " +
                    ep.getName() + " (" + ep.getEpisodeCode() + ") - " + ep.getCharacters().size() + " characters"));
        } else {
            System.out.println("Failed to fetch episodes. Response code: " + response.code());
        }
    }

    public RickAndMortyService getRickAndMortyService() {
        return rickAndMortyService;
    }
}

