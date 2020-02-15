package com.example.rule.editor.model;

public class Product {

    private String marketSector;
    private String secuityTypeLevel1;
    private String country;

    Product(ProductBuilder builder) {
        this.marketSector = builder.getMarketSector();
        this.secuityTypeLevel1 = builder.getSecuityTypeLevel1();
        this.country = builder.getCountry();
    }

    public String getMarketSector() {
        return marketSector;
    }

    public void setMarketSector(String marketSector) {
        this.marketSector = marketSector;
    }

    public String getSecuityTypeLevel1() {
        return secuityTypeLevel1;
    }

    public void setSecuityTypeLevel1(String secuityTypeLevel1) {
        this.secuityTypeLevel1 = secuityTypeLevel1;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
