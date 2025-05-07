package com.tolkachev.tdd_lection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VisaRequestControllerTest {

    @Autowired TestRestTemplate testRestTemplate;

    @Test
    void should_accept_user_id_and_return_200() {
//        when
        ResponseEntity<String> response = testRestTemplate.postForEntity("/visa/request?userId=user-0",
                null,
                String.class);

//      then
        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
