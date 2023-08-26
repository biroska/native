package com.example.demo.controller;

import com.example.demo.model.TopRated;
import com.example.demo.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @RequestMapping("/top-rated")
    TopRated topRated() {
        return service.topRated();
    }

}
