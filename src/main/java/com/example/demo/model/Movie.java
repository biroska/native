package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Movie(Boolean adult, String backdrop_path, List<Integer> genre_ids, Integer id, String language,
                    String originalTitle, String overview, Float popularity, String posterPath, String releaseDate,
                    String title, Boolean video, Float voteAverage, Integer voteCount) { }
