package com.example;

public class StockServices {

    private StockRepository repository;

    public StockServices(StockRepository repository) {
        this.repository = repository;
    }

    public String checkPrice() {
        return repository.getStockPrice();
    }

}