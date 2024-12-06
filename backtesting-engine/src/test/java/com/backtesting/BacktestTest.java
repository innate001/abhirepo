// src/test/java/com/backtesting/BacktestTest.java

package com.backtesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class BacktestTest {

    @Test
    public void testBacktest() {
        // Create mock historical data (you can replace this with real data)
        List<HistoricalPrice> historicalData = new ArrayList<>();
        historicalData.add(new HistoricalPrice("2024-01-01", 100));
        historicalData.add(new HistoricalPrice("2024-01-02", 105));
        historicalData.add(new HistoricalPrice("2024-01-03", 110));

        // Initialize strategy and backtest
        Strategy strategy = new MovingAverageCrossoverStrategy(2, 3);
        Backtest backtest = new Backtest(10000);
        backtest.runBacktest(historicalData, strategy);

        // Verify backtest results
        // This is a simplified example, you would want to assert actual performance metrics
        assertTrue("Backtest did not perform as expected", true); // Example, replace with real assertions
    }
}