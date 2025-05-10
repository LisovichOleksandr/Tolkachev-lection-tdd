package com.tolkachev.tdd_lection;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class HttpRestConfiguration {

    private final RestTemplateBuilder restTemplateBuilder;

    @Bean
    public RestTemplate visaRestTemplate() {
        return restTemplateBuilder.build();
    }
}
