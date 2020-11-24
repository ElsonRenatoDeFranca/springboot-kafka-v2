package com.training.kafka.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class HomeController {

    @Autowired
    KafkaTemplate<String, UserModel> kafkaTemplate;
    private static final String TOPIC = "TestTopic";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable ("name") String name){
        
        kafkaTemplate.send(TOPIC, new UserModel(name, "Technology", 2000L));
        return "published successfully";
    }
}

