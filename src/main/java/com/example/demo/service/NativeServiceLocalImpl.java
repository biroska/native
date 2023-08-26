package com.example.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("local")
public class NativeServiceLocalImpl implements NativeService {
    @Override
    public String nativeProfile() {
        return "Hello World - Local";
    }
}
