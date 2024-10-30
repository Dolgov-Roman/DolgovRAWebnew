package ru.mirea.dolgov.RickandMorty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Episode {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("air_date")
    private String airDate;

    @JsonProperty("episode")
    private String episodeCode;

    @JsonProperty("characters")
    private List<String> characters;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getEpisodeCode() {
        return episodeCode;
    }

    public List<String> getCharacters() {
        return characters;
    }
}

package ru.mirea.dolgov.RickandMorty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Episode {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("air_date")
    private String airDate;

    @JsonProperty("episode")
    private String episodeCode;

    @JsonProperty("characters")
    private List<String> characters;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getEpisodeCode() {
        return episodeCode;
    }

    public List<String> getCharacters() {
        return characters;
    }
}

