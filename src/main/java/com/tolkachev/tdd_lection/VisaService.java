package com.tolkachev.tdd_lection;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class VisaService {

    private final RestTemplate visaRestTemplate;
    private final HttpProperties properties;

    public String createVisa(String s) {
        ResponseEntity<String> response = visaRestTemplate.postForEntity(
                properties.getVisaEndpoint() + "/request?userId=" + s,
                null,
                String.class);
        return response.getBody();
    }
}
