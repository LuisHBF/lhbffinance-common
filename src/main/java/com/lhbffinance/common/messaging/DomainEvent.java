package com.lhbffinance.common.messaging;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public abstract class DomainEvent {
    private final LocalDateTime occurredAt = LocalDateTime.now();

    public abstract String getEventName();

}