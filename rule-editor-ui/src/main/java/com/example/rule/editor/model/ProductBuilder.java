package com.example.rule.editor.model;

public class ProductBuilder {

    private String marketSector;
    private String secuityTypeLevel1;
    private String country;

    String getMarketSector() {
        return marketSector;
    }

    String getSecuityTypeLevel1() {
        return secuityTypeLevel1;
    }

    String getCountry() {
        return country;
    }

    public ProductBuilder marketSector(String marketSector) {
        this.marketSector = marketSector;
        return this;
    }

    public ProductBuilder secuityTypeLevel1(String secuityTypeLevel1) {
        this.secuityTypeLevel1 = secuityTypeLevel1;
        return this;
    }

    public ProductBuilder country(String country) {
        this.country = country;
        return this;
    }

    public Product build() {
        return new Product(this);
    }
}
