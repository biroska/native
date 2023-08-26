package com.example.demo.service;

import com.example.demo.client.TmdbApi;
import com.example.demo.model.TopRated;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final TmdbApi api;

    public MovieServiceImpl(TmdbApi api) {
        this.api = api;
    }

    @Override
    public TopRated topRated() {
        return api.getTopRated();
    }
}
