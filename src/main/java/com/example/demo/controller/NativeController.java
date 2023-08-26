package com.example.demo.controller;

import com.example.demo.service.NativeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NativeController {

    private final NativeService service;

    public NativeController(NativeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    String home() {
        return service.nativeProfile();
    }

}
