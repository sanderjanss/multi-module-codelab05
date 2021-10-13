package com.switchfullywork.domain;

import java.util.HashMap;
import java.util.Map;

public class StockRepository {
    private final Map<String, Stock> stockMap;

    public StockRepository(Map<String, Stock> stockMap) {
        this.stockMap = new HashMap<>();
        stockMap.put("AA", new Stock("AA", "Ambro AN"));
    }

    public Stock getStockInformation(String stockId){
        if(!stockMap.containsKey(stockId)){
            throw new IllegalArgumentException("No stock was found in the database");
        }
        return stockMap.get(stockId);
    }
}
