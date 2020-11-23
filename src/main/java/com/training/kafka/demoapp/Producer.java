package com.training.kafka.demoapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
}
