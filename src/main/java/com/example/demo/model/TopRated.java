package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TopRated(Integer page, List<Movie> results, Integer totalPages, Integer totalResults) { }
