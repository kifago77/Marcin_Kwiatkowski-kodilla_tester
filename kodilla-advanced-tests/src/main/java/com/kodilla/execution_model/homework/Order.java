package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double value;
    private LocalDate localDate;
    private String loginUsername;
    public Order(double value, LocalDate localDate, String loginUsername) {
        this.value = value;
        this.localDate = localDate;
        this.loginUsername = loginUsername;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public double getValue() {
        return value;
    }
}
