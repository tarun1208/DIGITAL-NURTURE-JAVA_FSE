package com.example;

public class StockManager {

    private StockService stockService;

    public StockManager(StockService stockService) {
        this.stockService = stockService;
    }

    public String getPrice() {
        return stockService.getStockPrice();
    }

}