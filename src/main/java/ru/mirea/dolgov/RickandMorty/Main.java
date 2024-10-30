package ru.mirea.dolgov.RickandMorty;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            RickAndMortyClient client = new RickAndMortyClient();
            client.findEpisodeWithMaxCharacters();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
