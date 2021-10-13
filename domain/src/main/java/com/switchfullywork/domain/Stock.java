package com.switchfullywork.domain;

import java.math.BigDecimal;

public class Stock {
    private final String id;
    private final String name;
    private StockPrice price;

    public Stock(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public void setPrice(BigDecimal price){
        this.price.setPrice(price);
    }
}
