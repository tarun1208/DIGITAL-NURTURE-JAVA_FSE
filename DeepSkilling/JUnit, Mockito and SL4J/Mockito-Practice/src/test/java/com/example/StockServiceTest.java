package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StockServiceTest {

    @Test
    void testMultipleReturns() {

        // Create Mock
        StockRepository mockRepository = mock(StockRepository.class);

        //Configure Multiple Returns
        when(mockRepository.getStockPrice()).thenReturn("100", "105", "110");

        //Inject Mock
        StockServices service =new StockServices(mockRepository);

        //Verifying Each Call
        assertEquals("100", service.checkPrice());
        assertEquals("105", service.checkPrice());
        assertEquals("110", service.checkPrice());

        //Verifying Method Calls
        verify(mockRepository, times(3)).getStockPrice();

    }

}