package com.example.demo.client;

import com.example.demo.binding.TheMovieDbConfig;
import com.example.demo.model.TopRated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class TmdbApiImpl implements TmdbApi {

    RestClient restClient = RestClient.create();

//    @Value("${tmdb.api.top-rated}")
    private String topRated ="https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1";

    @Autowired
    private TheMovieDbConfig config;


    @Override
    public TopRated getTopRated() {

//        MessageFormat.format("TmdbApiImpl.getTopRated: {0}", config );

        System.out.println("TmdbApiImpl.getTopRated : " + config );


        ResponseEntity<TopRated> result = restClient.get()
                .uri(topRated)
                .accept(APPLICATION_JSON)
                .header( "Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MzgwZDNjOWMxYmVjZGQyNmM5ZTMxZDkwMDA1MzQ5OCIsInN1YiI6IjVjN2YwYzcwYzNhMzY4NGU5OGQyYmIxOSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.fO5FaE5tBuh_ezP3XP0SwYkjLOIw78Hc1LhlqUjrDDU" )
                .retrieve()
                .toEntity(TopRated.class);

        return result.getBody();
    }
}
