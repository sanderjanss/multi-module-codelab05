package com.switchfullywork.interfac;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class ExternalStockInformationService {

    public BigDecimal getPriceInEuroForStock(String stockId){
        return new BigDecimal(RandomUtils.nextInt(10, 100));
    }
}
