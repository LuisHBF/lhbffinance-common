package com.lhbffinance.common.vo;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class Email extends SimpleValueObject<String> {

    @NotNull
    @jakarta.validation.constraints.Email
    private final String value;

    protected Email() {
        super("");
        this.value = "";
    }

    public Email(String value) {
        super(value);
        this.value = value;
    }

    @Override
    protected void validate(String value) {
        return;
    }

    @Override
    public String getValue() {
        return value;
    }
}