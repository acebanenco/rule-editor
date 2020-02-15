package com.example.rule.editor.model;

import java.math.BigDecimal;

public class FactorInformation {

    private BigDecimal weight;

    public FactorInformation() {
    }

    public FactorInformation(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
