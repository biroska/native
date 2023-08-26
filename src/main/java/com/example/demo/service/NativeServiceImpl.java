package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
@Profile("!local")
public class NativeServiceImpl implements NativeService {

    @Value("${application.version}")
    private String version;

    @Value("${api.top-rated}")
    private String topRated;
    @Override
    public String nativeProfile() {
        return MessageFormat.format("Hello World! {0} - {1}", version, topRated.substring(0,10));
    }
}
