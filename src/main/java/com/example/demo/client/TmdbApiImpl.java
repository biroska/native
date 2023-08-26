package com.example.demo.client;

import com.example.demo.model.TopRated;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class TmdbApiImpl implements TmdbApi {

    RestClient restClient = RestClient.create();

    @Value("${api.top-rated}")
    private String topRated;


    @Override
    public TopRated getTopRated() {

        ResponseEntity<TopRated> result = restClient.get()
                .uri(topRated)
                .accept(APPLICATION_JSON)
                .header( "Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MzgwZDNjOWMxYmVjZGQyNmM5ZTMxZDkwMDA1MzQ5OCIsInN1YiI6IjVjN2YwYzcwYzNhMzY4NGU5OGQyYmIxOSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.fO5FaE5tBuh_ezP3XP0SwYkjLOIw78Hc1LhlqUjrDDU" )
                .retrieve()
                .toEntity(TopRated.class);

        return result.getBody();
    }
}
