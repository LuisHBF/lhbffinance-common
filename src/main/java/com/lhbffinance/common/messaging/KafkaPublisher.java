package com.lhbffinance.common.messaging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaPublisher {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void publish(DomainEvent event) {
        String topic = event.getEventName();
        log.info("Publishing event to topic {}: {}", topic, event);
        kafkaTemplate.send(topic, event);
    }
}