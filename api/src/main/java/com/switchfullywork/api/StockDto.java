package com.switchfullywork.api;

import com.switchfullywork.domain.Stock;

public class StockDto {
    private final Stock stock;

    public StockDto(Stock stock) {
        this.stock = stock;
    }
}
