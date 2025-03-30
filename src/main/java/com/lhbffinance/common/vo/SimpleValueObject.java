package com.lhbffinance.common.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class SimpleValueObject<T> {

    protected final T value;

    protected SimpleValueObject(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Value must not be null");
        }
        this.value = value;
        validate(value);
    }

    protected abstract void validate(T value);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleValueObject<?> that)) return false;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}