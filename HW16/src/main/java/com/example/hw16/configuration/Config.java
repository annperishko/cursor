package com.example.hw16.configuration;

import com.example.hw16.components.Head;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public Head head() {
        return new Head();
    }

}
