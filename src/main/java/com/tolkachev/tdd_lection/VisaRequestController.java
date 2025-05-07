package com.tolkachev.tdd_lection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visa")
public class VisaRequestController {

    @PostMapping("/request")
    public ResponseEntity<String> createNewVisa(@RequestParam String userId) {
        return ResponseEntity.ok("ANY");
    }
}
