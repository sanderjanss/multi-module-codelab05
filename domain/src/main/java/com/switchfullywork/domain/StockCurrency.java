package com.switchfullywork.domain;

public enum StockCurrency {
    EUR("Euro", "€"), USD("Dollar", "$"), GBP("Pound", "£");

    private final String label;
    private final String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;
    }
}
