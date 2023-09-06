package com.example.demo.binding;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@PropertySource("classpath:tmdb.yml")
@ConfigurationProperties(prefix = "tmdb.api")
public class TheMovieDbConfig {


    private final String apiKey;
    private final String accessToken;
    private final String topRated;

    public TheMovieDbConfig(String apiKey, String accessToken, String topRated) {
        this.apiKey = apiKey;
        this.accessToken = accessToken;
        this.topRated = topRated;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTopRated() {
        return topRated;
    }

    @Override
    public String toString() {
        return "TheMovieDbConfig{" +
                "topRated='" + topRated + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
