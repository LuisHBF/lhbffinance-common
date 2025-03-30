package com.lhbffinance.common.vo;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class FullName extends SimpleValueObject<String> {

    @NotNull
    @Size(min = 2, max = 100)
    private final String value;

    protected FullName() {
        super("");
        this.value = "";
    }

    public FullName(String value) {
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