package com.example;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTest {

    Performance performance = new Performance();

    @Test
    void testPerformance() {

        assertTimeout(Duration.ofSeconds(3), () -> {
            performance.processTask();
        });

    }

}