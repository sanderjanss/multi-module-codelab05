package com.switchfullywork.service;

import com.switchfullywork.domain.Stock;
import com.switchfullywork.domain.StockRepository;
import com.switchfullywork.interfac.ExternalStockInformationService;

import java.math.BigDecimal;

public class StockService {
    private StockRepository stockRepository;
    private ExternalStockInformationService externalStockInformationService;


    public Stock getStock(String stockId){
        Stock stock = stockRepository.getStockInformation(stockId);
        BigDecimal stockPrice = externalStockInformationService.getPriceInEuroForStock(stockId);
        stock.setPrice(stockPrice);
        return stock;
    }
}
