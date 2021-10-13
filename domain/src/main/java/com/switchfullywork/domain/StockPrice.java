package com.switchfullywork.domain;

import java.math.BigDecimal;

public class StockPrice {

    private BigDecimal price;
    private final StockCurrency currency;

    public StockPrice(BigDecimal price, StockCurrency currency) {
        this.price = price;
        this.currency = currency;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
