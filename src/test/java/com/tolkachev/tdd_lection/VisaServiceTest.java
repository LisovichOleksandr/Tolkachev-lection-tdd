package com.tolkachev.tdd_lection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VisaServiceTest {

    @Mock RestTemplate template;
    @Spy HttpProperties properties = HttpProperties.builder().visaEndpoint("http://visa-service").build();
    @InjectMocks VisaService target;

    @Test
    void should_call_external_visa_service() {
        //given
        Mockito.when(template.postForEntity("http://visa-service/request?userId=user-0", null, String.class))
                .thenReturn(ResponseEntity.ok("ticket-0"));

        //when
        target.createVisa("user-0");
    }
}