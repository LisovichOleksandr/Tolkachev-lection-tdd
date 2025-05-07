package com.tolkachev.tdd_lection;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visa")
@RequiredArgsConstructor
public class VisaRequestController {

    private final VisaService visaService;

    @PostMapping("/request")
    public ResponseEntity<String> createNewVisa(@RequestParam String userId) {
        String ticketId = visaService.createVisa(userId);
        return ResponseEntity.ok(ticketId);
    }
}
