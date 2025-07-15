package com.abhi.components;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    private String providerName="GPay";

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String toString(){
        return "Payment { " +
                " providerName = '" + providerName + "'}";
    }
}
