package com.persys.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.persys.springbootkafka.payload.User;

@Service
public class JsonKafkaConsumer 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    

    @KafkaListener(topics = "my-kafka-topic-2", groupId = "myGroup")
    public void consume(User user)
    {
        LOGGER.info(String.format("JSON Message Received -> %s", user.toString()));
    }    
}
