package com.switchfullywork.api;

import com.switchfullywork.domain.Stock;
import service.StockService;

public class StockExchangerController {
    private StockService stockService;

    public StockDto getStock(String stockId){
       Stock stock = stockService.getStock(stockId);
       return new StockDto(stock);
    }
}
