package com.example.demo;

import com.example.demo.binding.TheMovieDbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({ TheMovieDbConfig.class })
public class NativeApplication {



	public static void main(String[] args) {
		SpringApplication.run(NativeApplication.class, args);
	}

}
