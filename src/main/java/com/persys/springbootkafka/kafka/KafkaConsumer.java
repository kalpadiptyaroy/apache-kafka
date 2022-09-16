package com.persys.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


// Note: if your Kafka Consumer class is not detected or not working then surely you have forgot to add @Service annotation.
@Service
public class KafkaConsumer 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    // the topic name was defined in the KafkaTopicConfig class.
    // the groupId was defined in the application.properties class.

    @KafkaListener(topics="my-kafka-topic-1", groupId = "myGroup")
    public void consume(String message)
    {
        LOGGER.info(String.format("Message Received -> %s", message));

    }
}
