package com.tolkachev.tdd_lection;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class VisaServiceCacheableTest {

    @MockitoBean RestTemplate template;
    @Autowired VisaService visaService;

    @Test
    void should_cache() {
        visaService.createVisa("000");
        visaService.createVisa("000");
        visaService.createVisa("000");
        visaService.createVisa("000");
        visaService.createVisa("000");
        visaService.createVisa("000");

        Mockito.verify(template, Mockito.times(1)).postForEntity(
                ArgumentMatchers.startsWith("http"),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.eq(String.class));
    }
}
