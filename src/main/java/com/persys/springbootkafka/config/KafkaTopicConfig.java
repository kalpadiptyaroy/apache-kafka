package com.persys.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig 
{   
    @Bean
    public NewTopic kafkaBrokerTopic()
    {
        
        return TopicBuilder.name("my-kafka-topic-1").build();
    }

    /* if we want to create partitions in the kafka topic then we do that follows.*/
    /* TopicBuilder.name("my-kafka-topic-1").partitions(10).build() */
    /* Simply add the .partitions(<number of partitions>) before the build function. */

    @Bean
    public NewTopic kafkaBrokerTopicForJson()
    {
        
        return TopicBuilder.name("my-kafka-topic-2").build();
    }
}
