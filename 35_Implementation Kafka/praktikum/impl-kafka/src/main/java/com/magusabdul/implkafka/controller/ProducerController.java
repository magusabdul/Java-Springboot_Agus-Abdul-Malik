package com.magusabdul.implkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/publish")
    public ResponseEntity<String> publicMessage() throws Exception {
        kafkaTemplate.send("students", "ABC");

        return new ResponseEntity<>("Succes publish message to kafka", HttpStatus.OK);
    }
}
