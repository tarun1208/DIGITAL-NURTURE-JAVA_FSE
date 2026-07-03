package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StockManagerTest {

    @Test
    void testMultipleReturns() {

        StockService mockService = mock(StockService.class);

        when(mockService.getStockPrice())
                .thenReturn("100", "105", "110");

        StockManager manager = new StockManager(mockService);

        assertEquals("100", manager.getPrice());
        assertEquals("105", manager.getPrice());
        assertEquals("110", manager.getPrice());

        verify(mockService, times(3)).getStockPrice();
    }
}