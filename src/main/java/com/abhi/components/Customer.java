package com.abhi.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name = "Abhishek";

    private Payment payment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Payment getPayment() {
        return payment;
    }

    // Setter based dependency injection
    @Autowired
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
